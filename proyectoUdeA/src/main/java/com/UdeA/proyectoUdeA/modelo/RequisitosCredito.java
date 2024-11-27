package com.UdeA.proyectoUdeA.modelo;

import jakarta.persistence.*;

@Entity
public class RequisitosCredito {
    @Id
    private int idRequisito;
    private int tiempoTrabajando;
    private double sueldo;
    private boolean esIndependiente;
    private boolean esTrabajadorDelEstado;
    private boolean esEstudiante;
    private boolean esEmpleadoParticular;
    private boolean espensionado;
    private boolean esCiudadanoResidente;

    @OneToOne
    @MapsId
    @JoinColumn(name = "idTipoCredito")
    private Credito idTipoCredito;

    public RequisitosCredito() {}

    public RequisitosCredito(int idRequisito, int tiempoTrabajando,
                             double sueldo, boolean esIndependiente,
                             boolean esTrabajadorDelEstado, boolean esEstudiante,
                             boolean esEmpleadoParticular, boolean espensionado,
                             boolean esCiudadanoResidente, Credito idTipoCredito) {
        this.idRequisito = idRequisito;
        this.tiempoTrabajando = tiempoTrabajando;
        this.sueldo = sueldo;
        this.esIndependiente = esIndependiente;
        this.esTrabajadorDelEstado = esTrabajadorDelEstado;
        this.esEstudiante = esEstudiante;
        this.esEmpleadoParticular = esEmpleadoParticular;
        this.espensionado = espensionado;
        this.esCiudadanoResidente = esCiudadanoResidente;
        this.idTipoCredito = idTipoCredito;
    }

    public int getIdRequisito() {return idRequisito;}

    public void setIdRequisito(int idRequisito) {this.idRequisito = idRequisito;}

    public int getTiempoTrabajando() {return tiempoTrabajando;}

    public void setTiempoTrabajando(int tiempoTrabajando) {this.tiempoTrabajando = tiempoTrabajando;}

    public double getSueldo() {return sueldo;}

    public void setSueldo(double sueldo) {this.sueldo = sueldo;}

    public boolean isEsIndependiente() {return esIndependiente;}

    public void setEsIndependiente(boolean esIndependiente) {this.esIndependiente = esIndependiente;}

    public boolean isEsTrabajadorDelEstado() {return esTrabajadorDelEstado;}

    public void setEsTrabajadorDelEstado(boolean esTrabajadorDelEstado) {this.esTrabajadorDelEstado = esTrabajadorDelEstado;}

    public boolean isEsEstudiante() {return esEstudiante;}

    public void setEsEstudiante(boolean esEstudiante) {this.esEstudiante = esEstudiante;}

    public boolean isEsEmpleadoParticular() {return esEmpleadoParticular;}

    public void setEsEmpleadoParticular(boolean esEmpleadoParticular) {this.esEmpleadoParticular = esEmpleadoParticular;}

    public boolean isEspensionado() {return espensionado;}

    public void setEspensionado(boolean espensionado) {this.espensionado = espensionado;}

    public boolean isEsCiudadanoResidente() {return esCiudadanoResidente;}

    public void setEsCiudadanoResidente(boolean esCiudadanoResidente) {this.esCiudadanoResidente = esCiudadanoResidente;}

    public Credito getPersona() {return idTipoCredito;}

    public void setPersona(Credito idTipoCredito) {this.idTipoCredito = idTipoCredito;}
}
