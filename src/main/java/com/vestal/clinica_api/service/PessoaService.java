package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.Pessoa;
import com.vestal.clinica_api.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> listarTodas() { return repository.findAll(); }
    public Pessoa salvar(Pessoa p) { return repository.save(p); }
    public void deletar(Long id) { repository.deleteById(id); }
}
