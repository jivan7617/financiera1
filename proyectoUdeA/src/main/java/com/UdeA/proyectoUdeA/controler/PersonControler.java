package com.UdeA.proyectoUdeA.controler;

import com.UdeA.proyectoUdeA.modelo.Credito;
import com.UdeA.proyectoUdeA.modelo.Persona;
import com.UdeA.proyectoUdeA.servicce.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:5173")
public class PersonControler {
    private final PersonaService personaService;

    public PersonControler(PersonaService personaService) {
        this.personaService = personaService;
    }
    @PostMapping
    public Persona insertarP(@RequestBody Persona persona){
        try{
            return personaService.insertarPersona(persona);
        } catch (RuntimeException e) {
            throw new RuntimeException( "error al insertar la persona", e);
        }
    }

    @GetMapping
    public List<Persona> consultarPersona() {
        try {
            return personaService.consultarPersona();
        } catch (RuntimeException e) {
            throw new RuntimeException("error al consultar el personas", e);
        }
    }

}
