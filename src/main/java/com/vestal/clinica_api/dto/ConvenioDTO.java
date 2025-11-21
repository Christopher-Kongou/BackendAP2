package com.vestal.clinica_api.dto;

public class ConvenioDTO {

    private Long id;
    private String nome;
    private String descricao;

    public ConvenioDTO() {} // construtor vazio obrigatório para JSON

    // ✅ Construtor que aceita todos os campos
    public ConvenioDTO(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
