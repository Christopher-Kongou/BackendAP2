package com.vestal.clinica_api.repository;

import com.vestal.clinica_api.model.ProfissionalSaude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfissionalSaudeRepository extends JpaRepository<ProfissionalSaude, Long> {

    @Query("SELECT p FROM ProfissionalSaude p JOIN FETCH p.pessoa")
    List<ProfissionalSaude> findAllWithPessoa();

}
