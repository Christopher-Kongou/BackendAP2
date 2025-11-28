package com.vestal.clinica_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "StatusCompromisso")
public class StatusCompromisso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    public StatusCompromisso() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
