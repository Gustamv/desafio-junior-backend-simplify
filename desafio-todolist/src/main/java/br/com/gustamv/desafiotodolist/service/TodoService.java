package br.com.gustamv.desafiotodolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.gustamv.desafiotodolist.entity.Todo;
import br.com.gustamv.desafiotodolist.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;
    
    
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        //realizar a listagem por prioridade e por ordem alfabetica instanciando um objeto de ordenacao sort
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending()
        );
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}
