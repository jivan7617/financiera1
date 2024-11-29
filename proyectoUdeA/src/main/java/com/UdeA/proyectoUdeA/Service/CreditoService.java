package com.UdeA.proyectoUdeA.Service;

import com.UdeA.proyectoUdeA.modelo.Credito;
import com.UdeA.proyectoUdeA.repository.CreditoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CreditoService {
    private CreditoRepository creditoRepository;

    public CreditoService(CreditoRepository creditoRepository) {
        this.creditoRepository = creditoRepository;

    }

    public Credito insertarCredito(Credito credito) {
        try {
            return creditoRepository.save(credito);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("error al insertar los datos");
        }
    }
    public List<Credito> consultarCredito(){
        return creditoRepository.findAll();
    }
}
