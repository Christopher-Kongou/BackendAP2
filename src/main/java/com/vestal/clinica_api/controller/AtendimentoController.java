package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.model.Atendimento;
import com.vestal.clinica_api.service.AtendimentoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

    private final AtendimentoService service;

    public AtendimentoController(AtendimentoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Atendimento> listar() { return service.listarTodos(); }

    @PostMapping
    public Atendimento criar(@RequestBody Atendimento a) { return service.salvar(a); }

    @PutMapping("/{id}")
    public Atendimento atualizar(@PathVariable Long id, @RequestBody Atendimento a) {
        a.setId(id);
        return service.salvar(a);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
