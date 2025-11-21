package com.vestal.clinica_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Compromisso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataHora;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private ProfissionalSaude profissional;

    @ManyToOne
    private StatusCompromisso status;

    @ManyToOne
    private TipoCompromisso tipo;

    public Compromisso() {}

    public Compromisso(Long id, LocalDateTime dataHora, Paciente paciente,
                       ProfissionalSaude profissional, StatusCompromisso status, TipoCompromisso tipo) {
        this.id = id;
        this.dataHora = dataHora;
        this.paciente = paciente;
        this.profissional = profissional;
        this.status = status;
        this.tipo = tipo;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public ProfissionalSaude getProfissional() { return profissional; }
    public void setProfissional(ProfissionalSaude profissional) { this.profissional = profissional; }

    public StatusCompromisso getStatus() { return status; }
    public void setStatus(StatusCompromisso status) { this.status = status; }

    public TipoCompromisso getTipo() { return tipo; }
    public void setTipo(TipoCompromisso tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return "Compromisso{id=" + id + ", dataHora=" + dataHora + ", paciente=" + paciente +
               ", profissional=" + profissional + ", status=" + status + ", tipo=" + tipo + "}";
    }
}
