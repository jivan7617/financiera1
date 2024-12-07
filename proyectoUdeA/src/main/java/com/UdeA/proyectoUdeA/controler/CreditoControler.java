package com.UdeA.proyectoUdeA.controler;

import com.UdeA.proyectoUdeA.modelo.Credito;
import com.UdeA.proyectoUdeA.servicce.CreditoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // Permite solicitudes desde tu cliente Vue

public class CreditoControler {

    private final CreditoService creditoService;

    public CreditoControler(CreditoService creditoService) {
        this.creditoService = creditoService;
    }

    @PostMapping("/insertarCredito")
    public Credito insertarCredito(@RequestBody Credito credito) {
        try {
            return creditoService.insertarCredito(credito);
        } catch (RuntimeException e) {
            throw new RuntimeException("error al insertar el credito", e);
        }
    }

    @GetMapping("/consultarCredito")
    public List<Credito> consultarCredito() {
        try {
            return creditoService.consultarCredito();
        } catch (RuntimeException e) {
            throw new RuntimeException("error al consultar el credito", e);
        }
    }
}
