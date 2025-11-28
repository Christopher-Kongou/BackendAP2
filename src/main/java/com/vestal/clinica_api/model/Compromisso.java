package com.vestal.clinica_api.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Compromissos")
public class Compromisso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compromisso_id") // Correção de mapeamento
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "profissional_id")
    private ProfissionalSaude profissional;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private Local local;

    @ManyToOne
    @JoinColumn(name = "tipo_compromisso_id")
    private TipoCompromisso tipo;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private StatusCompromisso status;

    @Column(name = "data_hora_inicio")
    private LocalDateTime dataHoraInicio;

    @Column(name = "data_hora_fim")
    private LocalDateTime dataHoraFim;

    @Column(name = "observacao")
    private String observacao;

    @Column(name = "agendado_por_usuario_id")
    private Long agendadoPorUsuarioId;

    // GETTERS e SETTERS
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public ProfissionalSaude getProfissional() { return profissional; }
    public void setProfissional(ProfissionalSaude profissional) { this.profissional = profissional; }

    public Local getLocal() { return local; }
    public void setLocal(Local local) { this.local = local; }

    public TipoCompromisso getTipo() { return tipo; }
    public void setTipo(TipoCompromisso tipo) { this.tipo = tipo; }

    public StatusCompromisso getStatus() { return status; }
    public void setStatus(StatusCompromisso status) { this.status = status; }

    public LocalDateTime getDataHoraInicio() { return dataHoraInicio; }
    public void setDataHoraInicio(LocalDateTime dataHoraInicio) { this.dataHoraInicio = dataHoraInicio; }

    public LocalDateTime getDataHoraFim() { return dataHoraFim; }
    public void setDataHoraFim(LocalDateTime dataHoraFim) { this.dataHoraFim = dataHoraFim; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public Long getAgendadoPorUsuarioId() { return agendadoPorUsuarioId; }
    public void setAgendadoPorUsuarioId(Long agendadoPorUsuarioId) { this.agendadoPorUsuarioId = agendadoPorUsuarioId; }
}
