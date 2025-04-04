// package com.andriele.desafio_todolist;

// import java.util.List;

// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.Mockito;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.context.bean.override.mockito.MockitoBean;
// import org.springframework.test.context.junit.jupiter.SpringExtension;

// import com.andriele.desafio_todolist.entity.Todo;
// import com.andriele.desafio_todolist.repository.TodoRepository;
// import com.andriele.desafio_todolist.service.TodoService;

// @SpringBootTest
// @ExtendWith(SpringExtension.class)
// class TodoServiceTests {
//     @Autowired
//     private TodoService service;

//     @MockitoBean
//     private TodoRepository repository;

//     @Test
//     public void testSave(){
//         Todo todo1 = new Todo();
//         todo1.setNome("tarefa 1");

//         // Mockando o repositório para retornar o "todo1" quando o método save for chamado
//         Mockito.when(repository.save(Mockito.any(Todo.class))).thenReturn(todo1);
        
//         // Mockando o repositório para simular a lista de todos (a ser retornada pelo list())

//         // Act: Chamando o método de criação do serviço
//         List<Todo> createdTodo = service.create(todo1); 

//         Assertions.assertNotNull(createdTodo);
//         Assertions.assertEquals(1, createdTodo.size());
//         // Assertions.assertEquals("tarefa 1", createdTodo.get(0).getNome());
//         Assertions.assertFalse(createdTodo.get(0).getRealizado());
//     }
    
// }
