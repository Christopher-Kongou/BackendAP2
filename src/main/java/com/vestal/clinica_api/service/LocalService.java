package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.Local;
import com.vestal.clinica_api.repository.LocalRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LocalService {

    private final LocalRepository repository;

    public LocalService(LocalRepository repository) {
        this.repository = repository;
    }

    public List<Local> listarTodos() {
        return repository.findAll();
    }

    public Local salvar(Local l) {
        return repository.save(l);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
