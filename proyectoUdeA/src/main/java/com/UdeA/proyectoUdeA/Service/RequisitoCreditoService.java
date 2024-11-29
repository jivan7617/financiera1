package com.UdeA.proyectoUdeA.Service;

import com.UdeA.proyectoUdeA.modelo.RequisitosCredito;
import com.UdeA.proyectoUdeA.repository.RequisitosCreditoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequisitoCreditoService {
    private RequisitosCreditoRepository requisitoCRepository;

    public RequisitoCreditoService(RequisitosCreditoRepository requisitoCRepository) {
        this.requisitoCRepository = requisitoCRepository;
    }
    public RequisitosCredito insertarRequisitoCredito(RequisitosCredito persona) {
        try{
            return requisitoCRepository.save(persona);
        }catch(Exception error){
            error.printStackTrace();
            throw new RuntimeException("Error al insertar persona");
        }
    }
    public List<RequisitosCredito> consultarRequisitoCredito(){
        return requisitoCRepository.findAll();
    }
}

