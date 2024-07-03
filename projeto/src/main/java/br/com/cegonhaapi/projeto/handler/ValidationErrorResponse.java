package br.com.cegonhaapi.projeto.handler;

import lombok.Data;

import java.util.List;

@Data
public class ValidationErrorResponse {
    private List<ErrorDetails> errors;

    public ValidationErrorResponse(List<ErrorDetails> errors) {
        this.errors = errors;
    }
}
