package com.vestal.clinica_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ProfissionaisSaude")
public class ProfissionalSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profissional")   // 🔥 Nome correto do campo no banco
    private Long id;

    @Column(nullable = false)
    private String especialidade;

    @Column(name = "registro_profissional", nullable = false)
    private String registroProfissional;

    @ManyToOne
    @JoinColumn(name = "pessoa_id", nullable = false)   // 🔥 Campo correto para FK
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

    public String getNome() {
        return pessoa != null ? pessoa.getNome() : null;
    }

    @Override
    public String toString() {
        return "ProfissionalSaude{id=" + id +
                ", especialidade='" + especialidade + '\'' +
                ", registroProfissional='" + registroProfissional + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
