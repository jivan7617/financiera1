package com.UdeA.proyectoUdeA.Service;

import com.UdeA.proyectoUdeA.modelo.TipoDeCredito;
import com.UdeA.proyectoUdeA.repository.TipoCreditoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDeCreditoService {
    private TipoCreditoRepository tipoCreditoRepository;

    public TipoDeCreditoService(TipoCreditoRepository tipoCreditoRepository) {
        this.tipoCreditoRepository = tipoCreditoRepository;
    }
    public TipoDeCredito insertarTipoDeCredito(TipoDeCredito TipoDeCredito) {
        try{
            return tipoCreditoRepository.save(TipoDeCredito);
        }catch(Exception error){
            error.printStackTrace();
            throw new RuntimeException("Error al insertar Tipo De Credito");
        }
    }
    public List<TipoDeCredito> consultarTipoDeCredito(){

        return tipoCreditoRepository.findAll();
    }
}

