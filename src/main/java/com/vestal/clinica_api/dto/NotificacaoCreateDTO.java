package com.vestal.clinica_api.dto;

import java.time.LocalDateTime;

public class NotificacaoCreateDTO {
    private String mensagem;
    private LocalDateTime dataHora;
    private Long usuarioId;

    // getters e setters
    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }
}
