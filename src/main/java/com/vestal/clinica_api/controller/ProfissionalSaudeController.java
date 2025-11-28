package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.model.ProfissionalSaude;
import com.vestal.clinica_api.service.ProfissionalSaudeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalSaudeController {

    private final ProfissionalSaudeService service;

    public ProfissionalSaudeController(ProfissionalSaudeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProfissionalSaude> listar() {
        return service.listarTodos();
    }
}
