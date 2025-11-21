package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.dto.ConvenioCreateDTO;
import com.vestal.clinica_api.dto.ConvenioDTO;
import com.vestal.clinica_api.model.Convenio;
import com.vestal.clinica_api.service.ConvenioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/convenios")
public class ConvenioController {

    private final ConvenioService service;

    public ConvenioController(ConvenioService service) {
        this.service = service;
    }

    @GetMapping
    public List<ConvenioDTO> listar() {
        return service.listarTodos().stream()
                .map(c -> new ConvenioDTO(c.getId(), c.getNome(), c.getDescricao()))
                .collect(Collectors.toList());
    }

    @PostMapping("/criar")
    public ConvenioDTO criar(@RequestBody ConvenioCreateDTO dto) {
        Convenio convenio = new Convenio();
        convenio.setNome(dto.getNome());
        convenio.setDescricao(dto.getDescricao());

        Convenio salvo = service.salvar(convenio);
        return new ConvenioDTO(salvo.getId(), salvo.getNome(), salvo.getDescricao());
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
