package com.vestal.clinica_api.dto;

public class StatusCompromissoDTO {
    private Long id;
    private String descricao;

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
