package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.Atendimento;
import com.vestal.clinica_api.repository.AtendimentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AtendimentoService {

    private final AtendimentoRepository repository;

    public AtendimentoService(AtendimentoRepository repository) {
        this.repository = repository;
    }

    public List<Atendimento> listarTodos() {
        return repository.findAll();
    }

    public Atendimento salvar(Atendimento a) {
        return repository.save(a);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
