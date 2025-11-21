package com.vestal.clinica_api.dto;

public class ProfissionalSaudeCreateDTO {
    private String nome;
    private String especialidade;

    // getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
}
