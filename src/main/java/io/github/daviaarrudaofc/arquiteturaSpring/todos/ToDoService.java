package io.github.daviaarrudaofc.arquiteturaSpring.todos;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    private ToDoRepository repository;

    public ToDoService(ToDoRepository toDoRepository){
        this.repository = toDoRepository;
    }

    public ToDoEntity salvar(ToDoEntity novoTodo){
        return repository.save(novoTodo);
    }

    public void atualizarStatus(ToDoEntity todo){
        repository.save(todo);
    }
    public ToDoEntity buscarPorId(Integer id){
         return repository.findById(id).orElse(null);
    }
}
