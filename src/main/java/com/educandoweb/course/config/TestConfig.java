package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

/*Aqui estou dizendo para o Spring que essa Classe é uma classe de configuração (@Configuration)
 * do meu perfil (@Profile) test, pois esse foi o perfil que eu setei no application.properties
 * Poderia ser outro nome mas no meu caso escolhi o perfil chamado "test"*/
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	
	/*Injeção de depedencia*/
	@Autowired
	private UserRepository userRepository;

	/*Vamos instanciar objetos e salvar no banco de dados,
	 * como fazer para executar isso quando o progama for iniciado?
	 * Implementando a classe com commandlinerunner*/
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Id nulo pois vai auto-incrementando.*/
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		/*Salvar os objetos no banco de dados, passando uma lista de objetos e salvando eles*/
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	
}
