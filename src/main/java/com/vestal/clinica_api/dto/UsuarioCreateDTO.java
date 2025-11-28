package com.vestal.clinica_api.dto;

public class UsuarioCreateDTO {
    public String nome;
    public String cpf;
    public String dataNascimento;
    public String telefone;
    public String email;
    public String login;
    public String senha;
    public String papel; // Paciente ou Profissional
    public String especialidade; // só se for profissional
}
