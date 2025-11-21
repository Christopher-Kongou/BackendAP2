package com.vestal.clinica_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String planoSaude;

    @ManyToOne
    private Pessoa pessoa;

    public Paciente() {}

    public Paciente(Long id, String planoSaude, Pessoa pessoa) {
        this.id = id;
        this.planoSaude = planoSaude;
        this.pessoa = pessoa;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPlanoSaude() { return planoSaude; }
    public void setPlanoSaude(String planoSaude) { this.planoSaude = planoSaude; }

    public Pessoa getPessoa() { return pessoa; }
    public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }

    @Override
    public String toString() {
        return "Paciente{id=" + id + ", planoSaude='" + planoSaude + "', pessoa=" + pessoa + "}";
    }
}
