package com.vestal.clinica_api.service;

import com.vestal.clinica_api.dto.UsuarioCreateDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {

    @PersistenceContext
    private EntityManager em;

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Transactional
    public void registrarUsuario(UsuarioCreateDTO dto) {

        String senhaHash = encoder.encode(dto.senha);

        em.createNativeQuery("CALL sp_registrar_usuario(?,?,?,?,?,?,?,?,?)")
                .setParameter(1, dto.nome)
                .setParameter(2, dto.cpf)
                .setParameter(3, dto.dataNascimento)
                .setParameter(4, dto.telefone)
                .setParameter(5, dto.email)
                .setParameter(6, dto.login)
                .setParameter(7, senhaHash)
                .setParameter(8, dto.papel)
                .setParameter(9, dto.especialidade)
                .executeUpdate();
    }
}
