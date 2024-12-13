package com.UdeA.proyectoUdeA.servicce;

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
    public Credito ActualizarCredito(int idCredito, Credito credito) {
        Credito creditoActual = creditoRepository.findById(idCredito).orElse(null);
        if (creditoActual == null) {
            throw new RuntimeException("Credito no encontrado");
        }
        creditoActual.setMontoCredito(credito.getMontoCredito());
        creditoActual.setPlazoCredito(credito.getPlazoCredito());
        creditoActual.setTasaInteres(credito.getTasaInteres());
        creditoActual.setFechaCredito(credito.getFechaCredito());

        return creditoRepository.save(creditoActual);
    }

}
