package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.Usuario;
import com.vestal.clinica_api.repository.UsuarioJpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioJpaRepository repository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioJpaRepository repository) {
        this.repository = repository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario salvar(Usuario u) {
        if (u.getSenha() != null) {
            u.setSenha(passwordEncoder.encode(u.getSenha())); // hash da senha
        }
        return repository.save(u);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    // ✅ Método necessário para autenticação
    public Optional<Usuario> autenticar(String username, String senha) {
        Optional<Usuario> usuarioOpt = repository.findByLogin(username); // findByLogin ou findByUsername no repository
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            if (passwordEncoder.matches(senha, usuario.getSenha())) {
                return Optional.of(usuario);
            }
        }
        return Optional.empty();
    }
}
