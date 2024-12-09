package com.UdeA.proyectoUdeA.repository;

import com.UdeA.proyectoUdeA.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, String> {
    List<Persona> findByprimerNombre(String primerNombre);
    List<Persona> findBytelefono(String telefono);

}

