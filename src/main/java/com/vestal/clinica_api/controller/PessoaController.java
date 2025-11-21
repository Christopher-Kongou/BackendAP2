package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.model.Pessoa;
import com.vestal.clinica_api.service.PessoaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pessoa> listar() { return service.listarTodas(); }

    @PostMapping
    public Pessoa criar(@RequestBody Pessoa pessoa) { return service.salvar(pessoa); }

    @PutMapping("/{id}")
    public Pessoa atualizar(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        pessoa.setId(id);
        return service.salvar(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
