package br.com.robsonsouza.todolist.repository;

import br.com.robsonsouza.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
