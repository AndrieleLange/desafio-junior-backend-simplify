package com.andriele.desafio_todolist.validator;

import org.springframework.stereotype.Component;

import com.andriele.desafio_todolist.entity.Todo;
import com.andriele.desafio_todolist.repository.TodoRepository;

@Component
public class TodoValidator {
    private TodoRepository todoRepository;
    
    public TodoValidator(TodoRepository repository) {
        this.todoRepository = repository;
    }

    public void validator(Todo todo){
        if(todoRepository.existsByNome(todo.getNome())){
            throw new IllegalArgumentException(" Já existe uma tarefa com este nome");
        } 
    }
}
