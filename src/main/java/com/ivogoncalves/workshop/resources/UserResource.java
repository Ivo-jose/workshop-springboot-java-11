package com.ivogoncalves.workshop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivogoncalves.workshop.entities.User;
import com.ivogoncalves.workshop.services.UserService;

@RestController //Dizendo que a classe é recurso web, implementado por controlador rest
@RequestMapping(value = "/users")//Dando um nome para o recurso, que sera usado na path.
public class UserResource {
	
	@Autowired
	private UserService service;

	//Endpoint
	@GetMapping //Diz que método responde a requisição HTTP do tipo GET
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
