package com.UdeA.proyectoUdeA.controler;

import com.UdeA.proyectoUdeA.modelo.Persona;
import com.UdeA.proyectoUdeA.servicce.PersonaService;
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
    public Persona insertarDatos(@RequestBody Persona persona){
        try{
            return personaService.insertarPersona(persona);
        } catch (RuntimeException e) {
            throw new RuntimeException( "error al insertar la persona", e);
        }
    }
}
