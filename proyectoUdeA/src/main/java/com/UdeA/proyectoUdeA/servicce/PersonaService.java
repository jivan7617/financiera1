package com.UdeA.proyectoUdeA.servicce;

import com.UdeA.proyectoUdeA.modelo.Persona;
import com.UdeA.proyectoUdeA.repository.PersonaRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    private PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public Persona insertarPersona(Persona persona) {
        try{
            return personaRepository.save(persona);
        }catch (DataAccessException error){
            error.printStackTrace();
            throw new RuntimeException("Error al insertar persona");
        }
    }

    public List<Persona> consultarPersona(){
        return personaRepository.findAll();
    }
    public  List<Persona> consultarPersonaPorprimerNombre(String primerNombre){
        return personaRepository.findByprimerNombre(primerNombre);
    }

    public  List<Persona> consultarPersonaPorTelefono(String telefono){
        return personaRepository.findBytelefono(telefono);
    }



}
