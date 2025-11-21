package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.Agenda;
import com.vestal.clinica_api.repository.AgendaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgendaService {

    private final AgendaRepository repository;

    public AgendaService(AgendaRepository repository) {
        this.repository = repository;
    }

    public List<Agenda> listarTodas() {
        return repository.findAll();
    }

    public Agenda salvar(Agenda a) {
        return repository.save(a);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
