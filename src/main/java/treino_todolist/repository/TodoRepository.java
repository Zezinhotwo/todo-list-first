package treino_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import treino_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
