package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.StatusCompromisso;
import com.vestal.clinica_api.repository.StatusCompromissoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StatusCompromissoService {

    private final StatusCompromissoRepository repository;

    public StatusCompromissoService(StatusCompromissoRepository repository) {
        this.repository = repository;
    }

    public List<StatusCompromisso> listarTodos() {
        return repository.findAll();
    }

    public StatusCompromisso salvar(StatusCompromisso s) {
        return repository.save(s);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
