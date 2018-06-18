package com.kelce.ftl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableJpaRepositories("com.kelce.ftl.repositories")
@CrossOrigin(origins = "http://localhost:4200")
public class FtlApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(FtlApplication.class, args);
	}
}
