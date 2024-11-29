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
    public RequisitosCredito insertarRequisitoCredito(RequisitosCredito requisitosCredito) {
        try{
            return requisitoCRepository.save(requisitosCredito);
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("Error al insertar requisito credito");
        }
    }
    public List<RequisitosCredito> consultarRequisitoCredito(){
        return requisitoCRepository.findAll();
    }
}

