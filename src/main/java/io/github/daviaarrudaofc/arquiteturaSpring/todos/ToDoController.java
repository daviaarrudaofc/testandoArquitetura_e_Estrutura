package io.github.daviaarrudaofc.arquiteturaSpring.todos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todos")
public class ToDoController {

    private ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @PostMapping
    public ToDoEntity salvar(@RequestBody ToDoEntity todo){
        return this.service.salvar(todo);

    }
    @PutMapping("{id}")
    public void atualizarStatus(
            @PathVariable("id") Integer id,@RequestBody ToDoEntity todo){
            todo.setId(id);
            service.atualizarStatus(todo);
    }
    @GetMapping("{id}")
    public ToDoEntity buscar(@PathVariable("id")Integer id){
        return service.buscarPorId(id);
    }
}
