
package com.kelce.ftl.rest.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kelce.ftl.entities.FtlUsers;
import com.kelce.ftl.repositories.UserRepo;

/**
 * @author BKelceoglu backend 2018 UserRest.java
 *
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("user")
public class UserRest
{

	private static final Logger log = LoggerFactory.getLogger(UserRest.class);

	@Autowired
	UserRepo userRepo;

	@GetMapping(path = "/all", produces = "application/json;charset=UTF-8")
	public List<FtlUsers> getAllUsersFromDB()
	{
		System.out.println("DENEME");
		for (FtlUsers u : userRepo.findAll())
		{
			log.info("USER: " + u);
		}
		return userRepo.findAll();
	}

	@PostMapping("/add")
	public ResponseEntity<FtlUsers> saveNewUser(@RequestBody FtlUsers ftlUsers)
	{
		FtlUsers saved = userRepo.save(ftlUsers);
		return ResponseEntity.ok().body(saved);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteUser(@RequestBody FtlUsers ftlUsers)
	{
		userRepo.delete(ftlUsers);
		return ResponseEntity.ok().body("Deleted");
	}
}
