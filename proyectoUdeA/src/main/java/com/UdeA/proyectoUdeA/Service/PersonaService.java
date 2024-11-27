package com.UdeA.proyectoUdeA.Service;

import com.UdeA.proyectoUdeA.modelo.Persona;
import com.UdeA.proyectoUdeA.repository.PersonaRepository;
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
        }catch(Exception error){
            error.printStackTrace();
            throw new RuntimeException("Error al insertar persona");
        }
    }
    public List<Persona> consultarPersona(){
        return personaRepository.findAll();
    }
}
