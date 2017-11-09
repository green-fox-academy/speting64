package com.greenfox.connectionwithmysql.repository;

import com.greenfox.connectionwithmysql.model.ToDo;
import com.greenfox.connectionwithmysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    List<ToDo> findAllByTitleIsLike(String title);
    List<ToDo> findAllByAssignee(String name);
    //List<ToDo> findTitleAndAssignee

}
