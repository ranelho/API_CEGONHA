package br.com.cegonhaapi.projeto.controller;

import br.com.cegonhaapi.projeto.domain.Usuario;

import java.sql.Date;
import java.util.List;

public record UsuarioResponse(String name, Date age, String email, String tel, Date pregnancy, Date borny, String pass, String pass_confirm) {

    public UsuarioResponse (Usuario usuario) {
        this(usuario.getName(), usuario.getAge(), usuario.getEmail(), usuario.getTel(), usuario.getPregnancy(), usuario.getBorny(), usuario.getPass(), usuario.getPass_confirm());
    }

    public static List<UsuarioResponse> converte(List<Usuario> usuarios) {
        return usuarios
                .stream()
                .map(UsuarioResponse::new)
                .toList();
    }
}
