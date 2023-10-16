package br.com.hellowilson.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * ITaskRepository
 */
public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findByIdUser(UUID idUser);
}