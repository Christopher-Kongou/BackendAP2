package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.TipoCompromisso;
import com.vestal.clinica_api.repository.TipoCompromissoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TipoCompromissoService {

    private final TipoCompromissoRepository repository;

    public TipoCompromissoService(TipoCompromissoRepository repository) {
        this.repository = repository;
    }

    public List<TipoCompromisso> listarTodos() {
        return repository.findAll();
    }

    public TipoCompromisso salvar(TipoCompromisso t) {
        return repository.save(t);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
