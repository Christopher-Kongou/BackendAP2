package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.Compromisso;
import com.vestal.clinica_api.repository.CompromissoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompromissoService {

    private final CompromissoRepository repository;

    public CompromissoService(CompromissoRepository repository) {
        this.repository = repository;
    }

    public List<Compromisso> listarTodos() {
        return repository.findAll();
    }

    public Compromisso salvar(Compromisso c) {
        return repository.save(c);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
