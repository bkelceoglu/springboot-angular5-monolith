
package com.kelce.ftl.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

@RestController
@RequestMapping("user")
public class UserRest
{

	@Autowired
	UserRepo userRepo;

	@GetMapping("all")
	public List<FtlUsers> getAllUsersFromDB()
	{
		return userRepo.findAll();
	}

	@PostMapping("add")
	public ResponseEntity<FtlUsers> saveNewUser(@RequestBody FtlUsers ftlUsers)
	{
		FtlUsers saved = userRepo.save(ftlUsers);
		return ResponseEntity.ok().body(saved);
	}
}
