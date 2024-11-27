package com.UdeA.proyectoUdeA.Service;

import com.UdeA.proyectoUdeA.modelo.Usuario;
import com.UdeA.proyectoUdeA.repository.UsuarioRerpository;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {
    private UsuarioRerpository usuarioRerpository;

    public UsuarioService(UsuarioRerpository usuarioRerpository) {
        this.usuarioRerpository = usuarioRerpository;
    }

    public Usuario insertarUsuario(Usuario usuario) {
        try{
            return usuarioRerpository.save(usuario);
        }catch (DataAccessException error){
            error.printStackTrace();
            throw new RuntimeException("Error al insertar persona");
        }
    }

    public List<Usuario> consultarUsuario(){
        return usuarioRerpository.findAll();
    }

}
