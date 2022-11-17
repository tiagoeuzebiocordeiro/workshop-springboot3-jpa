package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity; // Pacote faz minha classe depender da ESPECIFICAÇÃO.
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/*Anotação Entity = isso vai ser uma entidade do meu dominio no Banco de Dados*/
@Entity 
@Table(name = "tb_user") /*TB_USER = NOME DA TABELA DO BANCO DE DADOS, POIS NÃO PODE DEIXAR USER PQ É UMA PALAVRA RESERVADA DO BD H2*/
public class User implements Serializable {				/*Objeto seja transformado em cadeias de bytes.
 														Objeto possa ser gravado em arquivos, etc.*/
	private static final long serialVersionUID = 1L;
	
	/*JPA: Qual desses meus atributos é a chave primária?
	 * Vou dizer pra ele minha PK, que no caso, é o id, definimos isso com a anotação Arroba Id*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*Fica auto incremetando meu ID*/
	private Long id;
	
	
	private String name;
	private String email;
	private String phone;
	private String password;
	
	public User() {		/*Construtor vazio por usar Framework*/
	}

	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	/*Como vou comparar meus objetos? Eu escolhi através do ID, então gerar HashCode e Equals com o ID.*/
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
