package com.greenfox.connectionwithmysql;

import com.greenfox.connectionwithmysql.repository.AssigneeRepository;
import com.greenfox.connectionwithmysql.repository.ToDoRepository;
import com.greenfox.connectionwithmysql.model.Assignee;
import com.greenfox.connectionwithmysql.model.ToDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

	@Autowired
	AssigneeRepository assigneeRepository;

	@Autowired
	ToDoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ConnectionwithmysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
		todoRepository.save(new ToDo("I have to master Java Persistent API"));
		todoRepository.save(new ToDo("I have to use H2 database"));

		assigneeRepository.save(new Assignee("Andris","andris12@greenfox.com"));

	}
}
