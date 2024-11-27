package com.UdeA.proyectoUdeA.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipos de credito")
public class TipoDeCredito {
    @Id
    private int idTipoCredito;
    private String nombreCredito;

    public TipoDeCredito() {
    }

    public TipoDeCredito(int idTipoCredito, String nombreCredito){
        this.idTipoCredito = idTipoCredito;
        this.nombreCredito = nombreCredito;
    }

    public int getIdTipoCredito() {
        return idTipoCredito;
    }

    public void setIdTipoCredito(int idTipoCredito) {
        this.idTipoCredito = idTipoCredito;
    }

    public String getNombreCredito() {
        return nombreCredito;
    }

    public void setNombreCredito(String nombreCredito) {
        this.nombreCredito = nombreCredito;
    }

}
