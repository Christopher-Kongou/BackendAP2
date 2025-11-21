package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.model.TipoCompromisso;
import com.vestal.clinica_api.service.TipoCompromissoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tipos-compromissos")
public class TipoCompromissoController {

    private final TipoCompromissoService service;

    public TipoCompromissoController(TipoCompromissoService service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoCompromisso> listar() { return service.listarTodos(); }

    @PostMapping
    public TipoCompromisso criar(@RequestBody TipoCompromisso t) { return service.salvar(t); }

    @PutMapping("/{id}")
    public TipoCompromisso atualizar(@PathVariable Long id, @RequestBody TipoCompromisso t) {
        t.setId(id);
        return service.salvar(t);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
