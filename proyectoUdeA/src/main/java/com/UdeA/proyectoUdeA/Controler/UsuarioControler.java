package com.UdeA.proyectoUdeA.Controler;

import com.UdeA.proyectoUdeA.Service.UsuarioService;
import com.UdeA.proyectoUdeA.modelo.Usuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UsuarioControler {
    private final UsuarioService usuarioService;

    public UsuarioControler(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @PostMapping("/insertarU")
    public Usuario insertarUsuario(@RequestBody Usuario usuario) {
        try{
            return usuarioService.insertarUsuario(usuario);
        } catch (RuntimeException error) {
            throw new RuntimeException( "error al insertar la persona", error);
        }
    }
}
