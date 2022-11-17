package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController /*Essa anotação serve para dizer que essa classe é um Recurso WEB que é implementado por um controlador REST*/
@RequestMapping(value = "/users") /*Isso dá um nome pro recurso, de valor(caminho), recurso para entidade users, então vai chamar users*/
public class UserResource {			/*Essa classe disponibiliza um recurso web disponível para a entidade User*/

	@Autowired
	private UserService service;
	
	/*Para testar se está funcionando, vamos criar um método ResponseEntity que é um tipo
	 * específico do spring para retornar respostas de requisições Web*/
	
	/*GetMapping, vc vai dizer como vai funcioanr seu metodo de rota/caminho GET*/
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() { /*Método que responde as requisições WEB GET (endpoint para acessar users)*/
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list); /*Retorna uma requisição OK (resposta com sucesso no http de corpo body do user 
		que acabou de ser instanciado*/ 
	}
	
	@GetMapping(value = "/{id}") /*Uma requisição GET da rota /id (onde id é x) passando isso no metodo
	como @PathVariable ou seja Caminho do meu Long id*/
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
