package com.andriele.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andriele.desafio_todolist.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
    boolean existsByNome(String nome);
}
