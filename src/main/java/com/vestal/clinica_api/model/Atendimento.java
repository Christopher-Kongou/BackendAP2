package com.vestal.clinica_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataHora;
    private String observacoes;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private ProfissionalSaude profissional;

    public Atendimento() {}

    public Atendimento(Long id, LocalDateTime dataHora, String observacoes,
                       Paciente paciente, ProfissionalSaude profissional) {
        this.id = id;
        this.dataHora = dataHora;
        this.observacoes = observacoes;
        this.paciente = paciente;
        this.profissional = profissional;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public ProfissionalSaude getProfissional() { return profissional; }
    public void setProfissional(ProfissionalSaude profissional) { this.profissional = profissional; }

    @Override
    public String toString() {
        return "Atendimento{id=" + id + ", dataHora=" + dataHora +
               ", observacoes='" + observacoes + "', paciente=" + paciente +
               ", profissional=" + profissional + "}";
    }
}
