package com.greenfox.todo;

import com.greenfox.todo.repository.ToDoRepository;
import com.greenfox.todo.model.ToDo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

	@Autowired
	ToDoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
		todoRepository.save(new ToDo("I have to master Java Persistent API"));
		todoRepository.save(new ToDo("I have to use H2 database"));
	}
}
