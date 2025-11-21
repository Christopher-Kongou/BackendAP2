package com.vestal.clinica_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensagem;
    private LocalDateTime dataHora;
    private boolean lida;

    @ManyToOne
    private Usuario usuario;

    public Notificacao() {}

    public Notificacao(Long id, String mensagem, LocalDateTime dataHora, boolean lida, Usuario usuario) {
        this.id = id;
        this.mensagem = mensagem;
        this.dataHora = dataHora;
        this.lida = lida;
        this.usuario = usuario;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public boolean isLida() { return lida; }
    public void setLida(boolean lida) { this.lida = lida; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    @Override
    public String toString() {
        return "Notificacao{id=" + id + ", mensagem='" + mensagem + "', dataHora=" + dataHora +
               ", lida=" + lida + ", usuario=" + usuario + "}";
    }
}
