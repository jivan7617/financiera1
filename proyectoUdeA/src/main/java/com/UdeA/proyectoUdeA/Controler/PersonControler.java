package com.UdeA.proyectoUdeA.Controler;

import com.UdeA.proyectoUdeA.Service.PersonaService;
import com.UdeA.proyectoUdeA.modelo.Persona;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class PersonControler {
    private final PersonaService personaService;

    public PersonControler(PersonaService personaService) {
        this.personaService = personaService;
    }
    @PostMapping("/insertarP")
    public Persona insertarPerson(@RequestBody Persona persona) {
        try{
            return personaService.insertarPersona(persona);
        } catch (RuntimeException error) {
            throw new RuntimeException( "error al insertar la persona", error);
        }
    }
}
