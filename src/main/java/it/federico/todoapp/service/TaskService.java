package it.federico.todoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.federico.todoapp.model.Task;
import it.federico.todoapp.repository.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Transactional
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Transactional
    public List<Task> getTaskByTitle(String title) {
        return taskRepository.findByTitleIgnoreCase(title);
    }

    @Transactional
    public void removeTask(String title) {
        taskRepository.deleteByTitleIgnoreCase(title);
    }

    @Transactional
    public void createtask(String title) {
        taskRepository.save(new Task(title));
    }

}
