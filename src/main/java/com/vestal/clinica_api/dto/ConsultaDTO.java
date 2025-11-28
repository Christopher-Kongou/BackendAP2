package com.vestal.clinica_api.dto;

public class ConsultaDTO {
    private Long id;
    private String especialidade;
    private String profissional;
    private String data;
    private String horario;
    private String status;
    private boolean passada;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public String getProfissional() { return profissional; }
    public void setProfissional(String profissional) { this.profissional = profissional; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public boolean isPassada() { return passada; }
    public void setPassada(boolean passada) { this.passada = passada; }
}
