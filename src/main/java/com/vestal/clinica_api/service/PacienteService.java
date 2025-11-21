package com.vestal.clinica_api.service;

import com.vestal.clinica_api.model.Paciente;
import com.vestal.clinica_api.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public List<Paciente> listarTodas() { return repository.findAll(); }
    public Paciente salvar(Paciente p) { return repository.save(p); }
    public void deletar(Long id) { repository.deleteById(id); }
}
