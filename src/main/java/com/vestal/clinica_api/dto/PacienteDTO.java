package com.vestal.clinica_api.dto;

public class PacienteDTO {
    private Long id;
    private String nome;
    private String cpf;
    private Long convenioId;

    public PacienteDTO() {}
    public PacienteDTO(Long id, String nome, String cpf, Long convenioId) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.convenioId = convenioId;
    }

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public Long getConvenioId() { return convenioId; }
    public void setConvenioId(Long convenioId) { this.convenioId = convenioId; }
}
