package com.UdeA.proyectoUdeA.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Credito {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idCredito;

    @ManyToOne
    @JoinColumn(name = "documento_Persona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_tipoCredito")
    private TipoDeCredito tipoDeCredito;

    private double montoCredito;
    private int plazoCredito;
    private double tasaInteres;
    private LocalDate fechaCredito;

    public Credito() {
    }

    public Credito(int idCredito, Persona persona, TipoDeCredito tipoDeCredito,
                   double montoCredito, int plazoCredito, double tasaInteres,
                   LocalDate fechaCredito) {
        this.idCredito = idCredito;
        this.persona = persona;
        this.tipoDeCredito = tipoDeCredito;
        this.montoCredito = montoCredito;
        this.plazoCredito = plazoCredito;
        this.tasaInteres = tasaInteres;
        this.fechaCredito = fechaCredito;
    }

    public int getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(int idCredito) {
        this.idCredito = idCredito;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public TipoDeCredito getTipoDeCredito() {
        return tipoDeCredito;
    }

    public void setTipoDeCredito(TipoDeCredito tipoDeCredito) {
        this.tipoDeCredito = tipoDeCredito;
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
