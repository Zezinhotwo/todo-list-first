package treino_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import treino_todolist.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
