package br.com.cegonhaapi.projeto.domain;

import java.sql.Date;

import br.com.cegonhaapi.projeto.controller.UsuarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq_generator")
	@SequenceGenerator(name="usuario_seq_generator", sequenceName = "usuario_sequence", allocationSize=1)
	private Integer id;

	@Column(name = "name", length = 200, nullable = true)
	private String name;

	@Column(name = "cpf", length = 14, unique = true)
	@CPF
	String cpf;

	@Column(name = "age", nullable = true)
	private Date age;

	@Column(name = "email", length = 50, nullable = true)
	@Email
	private String email;

	@Column(name = "tel", length = 15, nullable = true)
	private String tel;

	@Column(name = "pregnancy")
	private Date pregnancy;

	@Column(name = "borny")
	private Date borny;

	@Column(name = "pass", length = 200, nullable = true)
	@Size(min = 6)
	private String pass;

	@Column(name = "pass_confirm", length = 200, nullable = true)
	@Size(min = 6)
	private String passConfirm;

	public Usuario(UsuarioRequest usuarioRequest) {
		this.name = usuarioRequest.name();
		this.cpf = usuarioRequest.cpf();
		this.age = usuarioRequest.age();
		this.email = usuarioRequest.email();
		this.tel = usuarioRequest.tel();
		this.pregnancy = usuarioRequest.pregnancy();
		this.borny = usuarioRequest.borny();
		this.pass = usuarioRequest.pass();
		this.passConfirm = usuarioRequest.passConfirm();
	}
}