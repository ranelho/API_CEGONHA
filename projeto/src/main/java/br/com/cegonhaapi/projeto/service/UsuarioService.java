package br.com.cegonhaapi.projeto.service;

import br.com.cegonhaapi.projeto.handler.UsuarioNotFoundException;
import br.com.cegonhaapi.projeto.repository.UsuarioJpaRepository;
import br.com.cegonhaapi.projeto.controller.UsuarioRequest;
import br.com.cegonhaapi.projeto.controller.UsuarioResponse;
import br.com.cegonhaapi.projeto.domain.Usuario;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private  final UsuarioJpaRepository usuarioJpaRepository;

    public List<UsuarioResponse> findAll() {
        List<Usuario> usuarios = usuarioJpaRepository.findAll();
        return UsuarioResponse.converte(usuarios);
    }

    public UsuarioResponse novoUsuario(UsuarioRequest usuarioRequest) {
        return new UsuarioResponse(new Usuario(usuarioRequest));
    }

    public UsuarioResponse findByCpf(String cpf) {
        Usuario usuario = usuarioJpaRepository.findByCpf(cpf)
                .orElseThrow(() -> new UsuarioNotFoundException(cpf));
        return new UsuarioResponse(usuario);
    }

    @Transactional
    public void deleteByCpf(String cpf) {
        Usuario usuario = usuarioJpaRepository.findByCpf(cpf)
                .orElseThrow(() -> new UsuarioNotFoundException(cpf));
        usuarioJpaRepository.delete(usuario);
    }
}
