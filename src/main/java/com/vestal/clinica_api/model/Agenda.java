package com.vestal.clinica_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data;

    @ManyToOne
    private ProfissionalSaude profissional;

    public Agenda() {}

    public Agenda(Long id, LocalDate data, ProfissionalSaude profissional) {
        this.id = id;
        this.data = data;
        this.profissional = profissional;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public ProfissionalSaude getProfissional() { return profissional; }
    public void setProfissional(ProfissionalSaude profissional) { this.profissional = profissional; }

    @Override
    public String toString() {
        return "Agenda{id=" + id + ", data=" + data + ", profissional=" + profissional + "}";
    }
}
