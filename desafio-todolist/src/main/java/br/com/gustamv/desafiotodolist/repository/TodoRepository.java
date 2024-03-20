package br.com.gustamv.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gustamv.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
