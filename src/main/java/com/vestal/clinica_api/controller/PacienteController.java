package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.model.Paciente;
import com.vestal.clinica_api.service.PacienteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Paciente> listar() { return service.listarTodas(); }

    @PostMapping
    public Paciente criar(@RequestBody Paciente p) { return service.salvar(p); }

    @PutMapping("/{id}")
    public Paciente atualizar(@PathVariable Long id, @RequestBody Paciente p) {
        p.setId(id);
        return service.salvar(p);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
