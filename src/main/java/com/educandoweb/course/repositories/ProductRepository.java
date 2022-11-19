package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;
/*Interface que faz interações com a entidade user, vai extender o JpaRepository onde dentro
 * dos <nome_entidade_para_interacao, tipo_primitivo_da_sua_chave_primaria>*/
public interface ProductRepository extends JpaRepository<Product, Long> {

}
