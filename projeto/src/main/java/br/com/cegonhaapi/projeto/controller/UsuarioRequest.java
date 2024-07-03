package br.com.cegonhaapi.projeto.controller;

import br.com.cegonhaapi.projeto.validation.PasswordMatches;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.sql.Date;

@PasswordMatches
public record UsuarioRequest(
        @NotBlank String name,
        @CPF @NotNull String cpf,
        @NotNull Date age,
        @Email String email,
        @NotBlank String tel,
        @NotNull Date pregnancy,
        @NotNull Date borny,
        @NotBlank String pass,
        @NotBlank String pass_confirm) {
}
