package br.com.cegonhaapi.projeto.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name", length = 200, nullable = true)
	private String name;

	@Column(name = "age", nullable = true)
	private Date age;

	@Column(name = "email", length = 50, nullable = true)
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
	private String pass_confirm;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAge() {
		return age;
	}

	public void setAge(Date age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getPregnancy() {
		return pregnancy;
	}

	public void setPregnancy(Date pregnancy) {
		this.pregnancy = pregnancy;
	}

	public Date getBorny() {
		return borny;
	}

	public void setBorny(Date borny) {
		this.borny = borny;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPass_confirm() {
		return pass_confirm;
	}

	public void setPass_confirm(String pass_confirm) {
		this.pass_confirm = pass_confirm;
	}

}