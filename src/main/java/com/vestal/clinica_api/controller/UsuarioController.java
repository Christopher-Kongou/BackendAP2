package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.dto.UsuarioCreateDTO;
import com.vestal.clinica_api.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping("/criar")
    public String criar(@RequestBody UsuarioCreateDTO dto) {
        service.registrarUsuario(dto);
        return "Usuário registrado com sucesso!";
    }
}
