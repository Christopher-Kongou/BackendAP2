package com.vestal.clinica_api.dto;

public class ProfissionalSaudeDTO {
    private Long id;
    private String nome;
    private String especialidade;

    public ProfissionalSaudeDTO() {}
    public ProfissionalSaudeDTO(Long id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
}
