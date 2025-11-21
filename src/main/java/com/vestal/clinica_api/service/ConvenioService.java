package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.Convenio;
import com.vestal.clinica_api.repository.ConvenioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConvenioService {

    private final ConvenioRepository repository;

    public ConvenioService(ConvenioRepository repository) {
        this.repository = repository;
    }

    public List<Convenio> listarTodos() {
        return repository.findAll();
    }

    public Optional<Convenio> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Convenio salvar(Convenio convenio) {
        return repository.save(convenio);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
