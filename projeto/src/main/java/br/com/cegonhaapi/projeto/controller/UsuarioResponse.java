package br.com.cegonhaapi.projeto.controller;

import br.com.cegonhaapi.projeto.domain.Usuario;

import java.sql.Date;
import java.util.List;

public record UsuarioResponse(String name, Date age, String email, String tel, Date pregnancy, Date borny, String pass, String passConfirm) {

    public UsuarioResponse (Usuario usuario) {
        this(usuario.getName(), usuario.getAge(), usuario.getEmail(), usuario.getTel(), usuario.getPregnancy(), usuario.getBorny(), usuario.getPass(), usuario.getPassConfirm());
    }

    public static List<UsuarioResponse> converte(List<Usuario> usuarios) {
        return usuarios
                .stream()
                .map(UsuarioResponse::new)
                .toList();
    }
}
