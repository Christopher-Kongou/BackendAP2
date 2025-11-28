package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.Compromisso;
import com.vestal.clinica_api.model.StatusCompromisso;
import com.vestal.clinica_api.repository.CompromissoRepository;
import com.vestal.clinica_api.repository.StatusCompromissoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CompromissoService {

    private final CompromissoRepository repository;
    private final StatusCompromissoRepository statusRepository;

    public CompromissoService(
            CompromissoRepository repository,
            StatusCompromissoRepository statusRepository
    ) {
        this.repository = repository;
        this.statusRepository = statusRepository;
    }

    // Buscar por paciente
    public List<Compromisso> buscarPorPaciente(Long pacienteId) {
        return repository.findByPacienteId(pacienteId);
    }

    // Cancelar consulta
    public void cancelar(Long id) {
        Compromisso c = repository.findById(id).orElseThrow();
        StatusCompromisso cancelado = statusRepository.findByNome("Cancelado");
        c.setStatus(cancelado);
        repository.save(c);
    }

    // Reagendar consulta
    public void reagendar(Long id, LocalDateTime novaDataHora) {
        Compromisso c = repository.findById(id).orElseThrow();
        c.setDataHoraInicio(novaDataHora);
        repository.save(c);
    }
}
