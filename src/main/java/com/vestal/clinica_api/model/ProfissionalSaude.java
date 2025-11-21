package com.vestal.clinica_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ProfissionalSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String especialidade;
    private String registroProfissional;

    @ManyToOne
    private Pessoa pessoa;

    public ProfissionalSaude() {}

    public ProfissionalSaude(Long id, String especialidade, String registroProfissional, Pessoa pessoa) {
        this.id = id;
        this.especialidade = especialidade;
        this.registroProfissional = registroProfissional;
        this.pessoa = pessoa;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public String getRegistroProfissional() { return registroProfissional; }
    public void setRegistroProfissional(String registroProfissional) { this.registroProfissional = registroProfissional; }

    public Pessoa getPessoa() { return pessoa; }
    public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }

    @Override
    public String toString() {
        return "ProfissionalSaude{id=" + id + ", especialidade='" + especialidade +
               "', registroProfissional='" + registroProfissional + "', pessoa=" + pessoa + "}";
    }
}
