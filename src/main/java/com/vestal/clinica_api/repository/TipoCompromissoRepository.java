package com.vestal.clinica_api.repository;

import com.vestal.clinica_api.model.TipoCompromisso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCompromissoRepository extends JpaRepository<TipoCompromisso, Long> {}
