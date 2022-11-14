package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController /*Recurso WEB que é implementado por um controlador REST*/
@RequestMapping(value = "/users") /*Isso dá um nome pro recurso, de valor(caminho), recurso para entidade users, então vai chamar users*/
public class UserResource {			/*Essa classe disponibiliza um recurso web disponível para a entidade User*/

	
	/*Para testar se está funcionando, vamos criar um método ResponseEntity que é um tipo
	 * específico do spring para retornar respostas de requisições Web*/
	
	@GetMapping
	public ResponseEntity<User> findAll() { /*Método que responde as requisições WEB GET*/
		User user = new User(1L, "Maria", "maria@gmail.com", "98821221", "12345");
		return ResponseEntity.ok().body(user); // Retorna uma requisição OK de corpo body do user que acabou de ser instanciado
	}
	
}
