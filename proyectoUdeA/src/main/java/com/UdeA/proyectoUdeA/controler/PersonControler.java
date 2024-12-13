package com.UdeA.proyectoUdeA.controler;

import com.UdeA.proyectoUdeA.modelo.Credito;
import com.UdeA.proyectoUdeA.modelo.Persona;
import com.UdeA.proyectoUdeA.servicce.PersonaService;
import org.springframework.http.ResponseEntity;
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

    /*@GetMapping("{primerNombre}")
    public  List<Persona> consultarPorPrimerNombre(@PathVariable String primerNombre) {
        try {
            return personaService.consultarPersonaPorprimerNombre(primerNombre);
        } catch (RuntimeException e) {
            throw new RuntimeException("error al consultar por nombre", e);
        }
    }*/
    /*@GetMapping("/{telefono}")
    public List<Persona> consultarPorTelefono(@PathVariable String telefono) {
        return personaService.consultarPersonaPorTelefono(telefono);
    }*/

    /*@DeleteMapping("/{idPersona}")
    public void eliminarPersona(@PathVariable String idPersona) {
        try{
            personaService.borrarPersona(idPersona);
            return "datos persona eliminados por " + idPersona;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/



}
