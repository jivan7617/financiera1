package com.UdeA.proyectoUdeA.modelo;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @Column( name = "email",nullable = false,length = 80, unique = true)
    private String Correo;
    private String nombreUsuario;
    private String contrasena;

    @OneToOne
    @MapsId
    @JoinColumn(name = "documento")
    private Persona persona;

    public Usuario() {}

    public Usuario(String correo, String nombreUsuario, String contrasena, Persona persona) {
        Correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.persona = persona;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Persona getPersona() {return persona;}

    public void setPersona(Persona persona) {this.persona = persona;}
}
