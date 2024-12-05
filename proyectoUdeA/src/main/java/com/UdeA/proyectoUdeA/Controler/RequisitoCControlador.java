package com.UdeA.proyectoUdeA.Controler;

import com.UdeA.proyectoUdeA.Service.RequisitoCreditoService;
import com.UdeA.proyectoUdeA.modelo.RequisitosCredito;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class RequisitoCControlador {
    private final RequisitoCreditoService requisitoCService;

    public RequisitoCControlador(RequisitoCreditoService requisitoCService) {
        this.requisitoCService = requisitoCService;
    }

    @PostMapping("/insertar Requisitos")
    public RequisitosCredito insertarRequisito(@RequestBody RequisitosCredito requisito) {
        return requisitoCService.insertarRequisitoCredito(requisito);
    }
}
