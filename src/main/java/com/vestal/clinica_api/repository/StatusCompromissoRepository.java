package com.vestal.clinica_api.repository;

import com.vestal.clinica_api.model.StatusCompromisso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusCompromissoRepository extends JpaRepository<StatusCompromisso, Long> {
    StatusCompromisso findByNome(String nome);
}
