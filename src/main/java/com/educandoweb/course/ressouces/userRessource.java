package com.educandoweb.course.ressouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class userRessource {
	
	@GetMapping
	public ResponseEntity<User> finAll(){
		 User u = new User(1L,"cleiton", "cleyton@gmail.com", "41999870724", "070286");
		 return ResponseEntity.ok().body(u);
	}

}
