package com.vestal.clinica_api.repository;

import com.vestal.clinica_api.model.Compromisso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompromissoRepository extends JpaRepository<Compromisso, Long> {}
