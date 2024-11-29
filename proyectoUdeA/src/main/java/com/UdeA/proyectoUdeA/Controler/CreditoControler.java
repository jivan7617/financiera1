package com.UdeA.proyectoUdeA.Controler;

import com.UdeA.proyectoUdeA.Service.CreditoService;
import com.UdeA.proyectoUdeA.modelo.Credito;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditoControler {

    private final CreditoService creditoService;

    public CreditoControler(CreditoService creditoService) {
        this.creditoService = creditoService;
    }
    @PostMapping("/insertarCredito")
    public Credito insertarCredito(@RequestBody Credito credito) {
        try{
            return creditoService.insertarCredito(credito);
        } catch (RuntimeException error) {
            throw new RuntimeException( "error al insertar la credito", error);
        }
    }
}

