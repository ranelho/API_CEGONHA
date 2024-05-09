package br.com.cegonhaapi.projeto.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.cegonhaapi.projeto.entity.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
