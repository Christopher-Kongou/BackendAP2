package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.ProfissionalSaude;
import com.vestal.clinica_api.repository.ProfissionalSaudeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProfissionalSaudeService {

    private final ProfissionalSaudeRepository repository;

    public ProfissionalSaudeService(ProfissionalSaudeRepository repository) {
        this.repository = repository;
    }

    public List<ProfissionalSaude> listarTodos() {
        return repository.findAll();
    }

    public ProfissionalSaude salvar(ProfissionalSaude p) {
        return repository.save(p);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
