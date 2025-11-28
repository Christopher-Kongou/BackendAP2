package com.vestal.clinica_api.controller;

import com.vestal.clinica_api.dto.ConsultaDTO;
import com.vestal.clinica_api.dto.ReagendarDTO;
import com.vestal.clinica_api.model.Compromisso;
import com.vestal.clinica_api.service.CompromissoService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    private final CompromissoService service;

    public ConsultaController(CompromissoService service) {
        this.service = service;
    }

    // LISTAR CONSULTAS DO PACIENTE
    @GetMapping("/paciente/{id}")
    public List<ConsultaDTO> listarPorPaciente(@PathVariable Long id) {

        List<Compromisso> lista = service.buscarPorPaciente(id);

        return lista.stream().map(c -> {
            ConsultaDTO dto = new ConsultaDTO();
            dto.setId(c.getId());

            // Especialidade do profissional
            if (c.getProfissional() != null) {
                dto.setEspecialidade(c.getProfissional().getEspecialidade());
            } else {
                dto.setEspecialidade("Não Informada");
            }

            // Nome do profissional
            if (c.getProfissional() != null && c.getProfissional().getPessoa() != null) {
                dto.setProfissional(c.getProfissional().getPessoa().getNome());
            } else {
                dto.setProfissional("Profissional Não Informado");
            }

            // Datas
            if (c.getDataHoraInicio() != null) {
                dto.setData(c.getDataHoraInicio().toLocalDate().toString());
                dto.setHorario(c.getDataHoraInicio().toLocalTime().toString());
                dto.setPassada(c.getDataHoraInicio().isBefore(LocalDateTime.now()));
            } else {
                dto.setData("N/A");
                dto.setHorario("N/A");
                dto.setPassada(true); // Se não tem data, é considerado passado/inválido
            }

            // Status
            if (c.getStatus() != null) {
                dto.setStatus(c.getStatus().getNome());
            } else {
                dto.setStatus("Desconhecido");
            }

            return dto;
        }).collect(Collectors.toList());
    }

    // CANCELAR CONSULTA
    @PutMapping("/{id}/cancelar")
    public void cancelar(@PathVariable Long id) {
        service.cancelar(id);
    }

    // REAGENDAR CONSULTA
    @PutMapping("/{id}/reagendar")
    public void reagendar(@PathVariable Long id, @RequestBody ReagendarDTO dto) {
        LocalDate novaData = LocalDate.parse(dto.getNovaData());
        LocalTime novoHorario = LocalTime.parse(dto.getNovoHorario());
        service.reagendar(id, LocalDateTime.of(novaData, novoHorario));
    }
}
