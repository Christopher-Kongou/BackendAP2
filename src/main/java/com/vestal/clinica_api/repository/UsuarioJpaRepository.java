package com.vestal.clinica_api.repository;

import com.vestal.clinica_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioJpaRepository extends JpaRepository<Usuario, Long> {

    // Alterar de findByUsername para findByLogin
    Optional<Usuario> findByLogin(String login);
}
