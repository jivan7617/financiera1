package com.UdeA.proyectoUdeA.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @Column(nullable = false,length = 10)
    private String idPersona;

    @Column(length =10, name = "primer nombre",nullable = false)
    private String primerNombre;

    @Column(length =10, name = "segundo nombre")
    private String segundoNombre;

    @Column(length =10, name = "primer apellido",nullable = false)
    private String primerApellido;

    @Column(length =10, name = "segundo apellido")
    private String segundoApellido;

    @Column(length =10, name = "telefono")
    private String telefono;

    public Persona() {}

    public Persona(String idPersona, String primerNombre,
                   String segundoNombre, String primerApellido,
                   String segundoApellido, String telefono) {
        this.idPersona = idPersona;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
