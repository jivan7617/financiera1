package com.UdeA.proyectoUdeA.Controler;

import com.UdeA.proyectoUdeA.Service.TipoDeCreditoService;
import com.UdeA.proyectoUdeA.modelo.TipoDeCredito;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class TipoDeCreditoControler {
    private final TipoDeCreditoService tipoDeCreditoService;

    public TipoDeCreditoControler(TipoDeCreditoService tipoDeCreditoService) {
        this.tipoDeCreditoService = tipoDeCreditoService;
    }
    @PostMapping("/insertar tipo credito")
    public TipoDeCredito insertarTipoDeCredito(@RequestBody TipoDeCredito tipoDeCredito) {
        try{
            return tipoDeCreditoService.insertarTipoDeCredito(tipoDeCredito);
        } catch (RuntimeException error) {
            throw new RuntimeException( "error al insertar la tipo de credito", error);
        }
    }
}
