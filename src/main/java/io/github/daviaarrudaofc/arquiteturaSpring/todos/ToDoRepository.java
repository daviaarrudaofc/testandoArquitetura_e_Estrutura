package io.github.daviaarrudaofc.arquiteturaSpring.todos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity, Integer> {
}
