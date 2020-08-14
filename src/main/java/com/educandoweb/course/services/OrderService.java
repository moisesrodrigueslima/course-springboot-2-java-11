package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service    //Faz com que a classe seja registrada como componente do SPRING.
public class OrderService {
	
	@Autowired
	private OrderRepository repository;  // OrderService depende de OrderRepository
	
	public List<Order> findAll() {       // Operação na camada de serviço
		return repository.findAll(); 	// Repassa a chamada para repository.findAll
		
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
 	}
}
