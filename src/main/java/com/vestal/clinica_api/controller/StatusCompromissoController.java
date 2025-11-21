package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.model.StatusCompromisso;
import com.vestal.clinica_api.service.StatusCompromissoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/status-compromissos")
public class StatusCompromissoController {

    private final StatusCompromissoService service;

    public StatusCompromissoController(StatusCompromissoService service) {
        this.service = service;
    }

    @GetMapping
    public List<StatusCompromisso> listar() { return service.listarTodos(); }

    @PostMapping
    public StatusCompromisso criar(@RequestBody StatusCompromisso s) { return service.salvar(s); }

    @PutMapping("/{id}")
    public StatusCompromisso atualizar(@PathVariable Long id, @RequestBody StatusCompromisso s) {
        s.setId(id);
        return service.salvar(s);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
