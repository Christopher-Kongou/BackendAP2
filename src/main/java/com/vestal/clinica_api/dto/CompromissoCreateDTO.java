package com.vestal.clinica_api.dto;

import java.time.LocalDateTime;

public class CompromissoCreateDTO {
    private Long pacienteId;
    private Long profissionalId;
    private Long tipoCompromissoId;
    private LocalDateTime dataHora;
    private Long statusId;

    // getters e setters
    public Long getPacienteId() { return pacienteId; }
    public void setPacienteId(Long pacienteId) { this.pacienteId = pacienteId; }

    public Long getProfissionalId() { return profissionalId; }
    public void setProfissionalId(Long profissionalId) { this.profissionalId = profissionalId; }

    public Long getTipoCompromissoId() { return tipoCompromissoId; }
    public void setTipoCompromissoId(Long tipoCompromissoId) { this.tipoCompromissoId = tipoCompromissoId; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public Long getStatusId() { return statusId; }
    public void setStatusId(Long statusId) { this.statusId = statusId; }
}
