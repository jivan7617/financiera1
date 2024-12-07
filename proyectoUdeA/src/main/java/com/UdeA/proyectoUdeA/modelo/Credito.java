package com.UdeA.proyectoUdeA.modelo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Credito {
    @Id
    private int idCredito;

    @ManyToOne
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
    private Persona idpersona;

    private double montoCredito;
    private int plazoCredito;
    private double tasaInteres;
    private LocalDate fechaCredito;

    public Credito() {
    }

    public Credito(int idCredito, Persona idpersona,
                   double montoCredito, int plazoCredito, double tasaInteres,
                   LocalDate fechaCredito) {
        this.idCredito = idCredito;
        this.idpersona = idpersona;
        this.montoCredito = montoCredito;
        this.plazoCredito = plazoCredito;
        this.tasaInteres = tasaInteres;
        this.fechaCredito = fechaCredito;
    }

    public Persona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Persona idpersona) {
        this.idpersona = idpersona;
    }

    public int getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(int idCredito) {
        this.idCredito = idCredito;
    }

    public Persona getPersona() {
        return idpersona;
    }

    public void setPersona(Persona idpersona) {
        this.idpersona = idpersona;
    }

    public double getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(double montoCredito) {
        this.montoCredito = montoCredito;
    }

    public int getPlazoCredito() {
        return plazoCredito;
    }

    public void setPlazoCredito(int plazoCredito) {
        this.plazoCredito = plazoCredito;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public LocalDate getFechaCredito() {
        return fechaCredito;
    }

    public void setFechaCredito(LocalDate fechaCredito) {
        this.fechaCredito = fechaCredito;
    }
}
