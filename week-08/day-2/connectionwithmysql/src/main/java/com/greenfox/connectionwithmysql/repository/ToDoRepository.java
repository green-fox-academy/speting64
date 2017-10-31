package com.greenfox.connectionwithmysql.repository;

import com.greenfox.connectionwithmysql.model.ToDo;

import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
