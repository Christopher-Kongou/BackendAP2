package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.model.Agenda;
import com.vestal.clinica_api.service.AgendaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/agendas")
public class AgendaController {

    private final AgendaService service;

    public AgendaController(AgendaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Agenda> listar() { return service.listarTodas(); }

    @PostMapping
    public Agenda criar(@RequestBody Agenda a) { return service.salvar(a); }

    @PutMapping("/{id}")
    public Agenda atualizar(@PathVariable Long id, @RequestBody Agenda a) {
        a.setId(id);
        return service.salvar(a);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
