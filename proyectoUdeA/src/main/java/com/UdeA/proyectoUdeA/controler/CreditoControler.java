package com.UdeA.proyectoUdeA.controler;

import com.UdeA.proyectoUdeA.modelo.Credito;
import com.UdeA.proyectoUdeA.servicce.CreditoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // Permite solicitudes desde tu cliente Vue

public class CreditoControler {

    private final CreditoService creditoService;

    public CreditoControler(CreditoService creditoService) {
        this.creditoService = creditoService;
    }
@RequestMapping("/credito")
    @PostMapping
    public Credito insertarCredito(@RequestBody Credito credito) {
        try {
            return creditoService.insertarCredito(credito);
        } catch (RuntimeException e) {
            throw new RuntimeException("error al insertar el credito", e);
        }
    }

    @GetMapping
    public List<Credito> consultarCredito() {
        try {
            return creditoService.consultarCredito();
        } catch (RuntimeException e) {
            throw new RuntimeException("error al consultar el credito", e);
        }
    }

    @PutMapping("/{idCredito}")
    public ResponseEntity<Credito> acctualizarCredito(@PathVariable int idCredito, @RequestBody Credito credito){
        try {
            return ResponseEntity.ok(creditoService.ActualizarCredito(idCredito, credito));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
}
