package com.UdeA.proyectoUdeA.repository;

import com.UdeA.proyectoUdeA.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRerpository extends JpaRepository<Usuario, String> {
}
