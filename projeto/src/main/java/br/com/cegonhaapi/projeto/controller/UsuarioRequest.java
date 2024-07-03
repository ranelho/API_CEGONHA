package br.com.cegonhaapi.projeto.controller;

import br.com.cegonhaapi.projeto.validation.PasswordMatches;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.sql.Date;

@PasswordMatches
public record UsuarioRequest(
        @NotBlank(message = "Nome é obrigatório")
        String name,
        @CPF(message = "Número do registro de contribuinte individual brasileiro (CPF) inválido")
        String cpf,
        @NotNull Date age,
        @Email(message = "Deve ser um endereço de e-mail bem formado")
        String email,
        String tel,
        Date pregnancy,
        @NotNull Date borny,
        @NotBlank(message = "Senha é obrigatória")
        String pass,
        @NotBlank(message = "Confirmação de senha é obrigatória")
        String passConfirm
) {
}
