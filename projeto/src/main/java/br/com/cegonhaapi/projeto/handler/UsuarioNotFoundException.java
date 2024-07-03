package br.com.cegonhaapi.projeto.handler;

public class UsuarioNotFoundException extends RuntimeException {
    public UsuarioNotFoundException(String cpf) {
        super("Usuário com CPF " + cpf + " não encontrado.");
    }
}
