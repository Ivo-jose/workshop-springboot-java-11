package com.ivogoncalves.workshop.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivogoncalves.workshop.entities.User;

@RestController //Dizendo que a classe é recurso web, implementado por controlador rest
@RequestMapping(value = "/users")//Dando um nome para o recurso, que sera usado na path.
public class UserResource {

	//Endpoint
	@GetMapping //Diz que método responde a requisição HTTP do tipo GET
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "998877665","1234567" );
		return ResponseEntity.ok().body(u);
	}
}
