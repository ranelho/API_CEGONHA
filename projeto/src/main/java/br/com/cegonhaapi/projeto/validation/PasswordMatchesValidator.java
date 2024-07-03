package br.com.cegonhaapi.projeto.validation;


import br.com.cegonhaapi.projeto.controller.UsuarioRequest;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, UsuarioRequest> {

    @Override
    public boolean isValid(UsuarioRequest usuarioRequest, ConstraintValidatorContext context) {
        return usuarioRequest.pass().equals(usuarioRequest.pass_confirm());
    }
}
