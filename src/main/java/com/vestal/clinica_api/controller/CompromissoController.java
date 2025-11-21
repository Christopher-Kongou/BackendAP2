package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.model.Compromisso;
import com.vestal.clinica_api.service.CompromissoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/compromissos")
public class CompromissoController {

    private final CompromissoService service;

    public CompromissoController(CompromissoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Compromisso> listar() { return service.listarTodos(); }

    @PostMapping
    public Compromisso criar(@RequestBody Compromisso c) { return service.salvar(c); }

    @PutMapping("/{id}")
    public Compromisso atualizar(@PathVariable Long id, @RequestBody Compromisso c) {
        c.setId(id);
        return service.salvar(c);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
