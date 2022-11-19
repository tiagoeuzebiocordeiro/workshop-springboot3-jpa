package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

/*Tenho que registrar no meu spring que é uma classe de Serviço. No UseRepository nao precisa
pois ele está herdando do JpaRepository e nele já está declarada que ele é uma Anotação do tipo repository*/

@Service 
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	/*Metodo findAll*/
	/*Aqui fazemos uma operação na camada de serviço que ela repassa a chamada
	 * para a camada de Data (Repository) para conseguir a informação findAll*/
	public List<Product> findAll() {
		return repository.findAll(); 
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
