package com.vestal.clinica_api.service;

import com.vestal.clinica_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TokenService tokenService;

    public String autenticar(String login, String senha) {

        // Chama a stored procedure
        Map<String, Object> dados = usuarioRepository.autenticar(login);

        // Não existe login
        if (dados == null) {
            return null;
        }

        String senhaHash = (String) dados.get("senha_hash");

        // Aqui você valida a senha (BCrypt)
        if (!new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder()
                .matches(senha, senhaHash)) {
            return null;
        }

        // Se chegou até aqui → usuário válido
        return tokenService.gerarToken(login);
    }
}
