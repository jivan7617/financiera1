package com.UdeA.proyectoUdeA.repository;

import com.UdeA.proyectoUdeA.modelo.Credito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CreditoRepository extends JpaRepository<Credito, Integer> {
    @Query("SELECT c  FROM Credito c WHERE c.idCredito = :idCredito")
    List<Credito> fiindByidCredito(@Param("idCredito") int idCredito);

}
