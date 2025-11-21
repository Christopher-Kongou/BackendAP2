package com.vestal.clinica_api.dto;

public class UsuarioDTO {

    private Long id;
    private String perfil;
    private String login;

    public UsuarioDTO() {}

    public UsuarioDTO(Long id, String perfil, String login) {
        this.id = id;
        this.perfil = perfil;
        this.login = login;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPerfil() { return perfil; }
    public void setPerfil(String perfil) { this.perfil = perfil; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
}
