package com.vestal.clinica_api.dto;

public class AgendaCreateDTO {
    private Long profissionalId;
    private String descricao;

    // getters e setters
    public Long getProfissionalId() { return profissionalId; }
    public void setProfissionalId(Long profissionalId) { this.profissionalId = profissionalId; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
