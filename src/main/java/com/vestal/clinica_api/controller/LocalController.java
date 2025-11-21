package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.model.Local;
import com.vestal.clinica_api.service.LocalService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/locais")
public class LocalController {

    private final LocalService service;

    public LocalController(LocalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Local> listar() { return service.listarTodos(); }

    @PostMapping
    public Local criar(@RequestBody Local l) { return service.salvar(l); }

    @PutMapping("/{id}")
    public Local atualizar(@PathVariable Long id, @RequestBody Local l) {
        l.setId(id);
        return service.salvar(l);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
