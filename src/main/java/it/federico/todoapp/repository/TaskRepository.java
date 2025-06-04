package it.federico.todoapp.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import it.federico.todoapp.model.Task;

public interface TaskRepository extends JpaRepository<Task, UUID>{
    
    public List<Task> findByTitleIgnoreCase(String title);
    public void deleteByTitleIgnoreCase(String title);
}
