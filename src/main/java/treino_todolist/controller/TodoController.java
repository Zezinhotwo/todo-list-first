package treino_todolist.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import treino_todolist.entity.Todo;
import treino_todolist.service.TodoService;

@RestController
@RequestMapping(value = "/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public ResponseEntity<List<Todo>> create(@RequestBody @Valid Todo todo) {
        return ResponseEntity.ok(todoService.create(todo));
    }

    @GetMapping
    public ResponseEntity<List<Todo>> list() {
        return ResponseEntity.ok(todoService.list());
    }

    @PutMapping
    public ResponseEntity<List<Todo>> update(@RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.update(todo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Todo>> delete(@PathVariable Long id) {
        return ResponseEntity.ok(todoService.delete(id));
    }
}