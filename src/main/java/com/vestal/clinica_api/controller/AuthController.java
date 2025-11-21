package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.repository.UsuarioRepository;
import com.vestal.clinica_api.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> body) {

        String login = body.get("login");
        String senha = body.get("senha");

        Map<String, Object> result = usuarioRepository.autenticar(login);

        if (result == null) {
            return Map.of("erro", "Usuário não encontrado");
        }

        String senhaHashBanco = (String) result.get("senha_hash");

        if (!senha.equals(senhaHashBanco)) {
            return Map.of("erro", "Senha incorreta");
        }

        String token = tokenService.gerarToken(login);

        return Map.of(
                "token", token,
                "usuario", result
        );
    }
}