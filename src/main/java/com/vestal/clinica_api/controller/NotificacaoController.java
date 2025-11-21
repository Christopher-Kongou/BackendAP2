package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.model.Notificacao;
import com.vestal.clinica_api.service.NotificacaoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notificacoes")
public class NotificacaoController {

    private final NotificacaoService service;

    public NotificacaoController(NotificacaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Notificacao> listar() { return service.listarTodas(); }

    @PostMapping
    public Notificacao criar(@RequestBody Notificacao n) { return service.salvar(n); }

    @PutMapping("/{id}")
    public Notificacao atualizar(@PathVariable Long id, @RequestBody Notificacao n) {
        n.setId(id);
        return service.salvar(n);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
