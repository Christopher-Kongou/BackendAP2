package com.vestal.clinica_api.repository;

import com.vestal.clinica_api.model.Compromisso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompromissoRepository extends JpaRepository<Compromisso, Long> {

    @Query("SELECT c FROM Compromisso c " +
           "JOIN FETCH c.profissional p " +
           "JOIN FETCH p.pessoa " +
           "JOIN FETCH c.status " +
           "WHERE c.paciente.id = :pacienteId")
    List<Compromisso> findByPacienteId(@Param("pacienteId") Long pacienteId);
}
