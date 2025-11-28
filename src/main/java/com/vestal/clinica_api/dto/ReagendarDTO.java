package com.vestal.clinica_api.dto;

public class ReagendarDTO {
    private String novaData;    // yyyy-MM-dd
    private String novoHorario; // HH:mm

    public String getNovaData() { return novaData; }
    public void setNovaData(String novaData) { this.novaData = novaData; }

    public String getNovoHorario() { return novoHorario; }
    public void setNovoHorario(String novoHorario) { this.novoHorario = novoHorario; }
}
