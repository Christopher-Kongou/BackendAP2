package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.dto.UsuarioCreateDTO;
import com.vestal.clinica_api.dto.UsuarioDTO;
import com.vestal.clinica_api.dto.UsuarioLoginDTO;
import com.vestal.clinica_api.model.Usuario;
import com.vestal.clinica_api.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    /**
     * Lista todos os usuários
     */
    @GetMapping
    public List<UsuarioDTO> listar() {
        return service.listarTodos().stream()
                .map(u -> new UsuarioDTO(u.getId(), u.getPerfil(), u.getLogin()))
                .collect(Collectors.toList());
    }

    /**
     * Cria um novo usuário com senha
     */
    @PostMapping("/criar")
    public UsuarioDTO criar(@RequestBody UsuarioCreateDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setLogin(dto.getLogin());
        usuario.setSenha(dto.getSenha()); // será hash no service
        usuario.setPerfil(dto.getPerfil());

        Usuario salvo = service.salvar(usuario);

        return new UsuarioDTO(salvo.getId(), salvo.getPerfil(), salvo.getLogin());
    }

    /**
     * Autentica o usuário pelo login e senha
     */
    @PostMapping("/login")
    public UsuarioDTO login(@RequestBody UsuarioLoginDTO dto) {
        return service.autenticar(dto.getLogin(), dto.getSenha())
                .map(u -> new UsuarioDTO(u.getId(), u.getPerfil(), u.getLogin()))
                .orElseThrow(() -> new RuntimeException("Login ou senha inválidos"));
    }
}
