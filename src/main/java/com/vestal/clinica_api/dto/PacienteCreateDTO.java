package com.vestal.clinica_api.dto;

public class PacienteCreateDTO {
    private String nome;
    private String cpf;
    private Long convenioId;

    // getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public Long getConvenioId() { return convenioId; }
    public void setConvenioId(Long convenioId) { this.convenioId = convenioId; }
}
