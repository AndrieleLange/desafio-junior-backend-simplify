package com.andriele.desafio_todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.andriele.desafio_todolist.entity.Todo;
import com.andriele.desafio_todolist.repository.TodoRepository;
import com.andriele.desafio_todolist.validator.TodoValidator;

@Service
public class TodoService {
    private TodoRepository todoRepository;
    private TodoValidator todoValidator;

    public TodoService(TodoRepository todoRepository, TodoValidator validator) {
        this.todoRepository = todoRepository;
        this.todoValidator = validator;
    }

    public List<Todo> create(Todo todo){
        todoValidator.validator(todo);
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").ascending().and(
            Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        
        return list();
    }

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }
}
