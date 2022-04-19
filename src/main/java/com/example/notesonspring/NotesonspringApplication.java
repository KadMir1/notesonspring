package com.example.notesonspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class NotesonspringApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(NotesonspringApplication.class, args);
	}

}
