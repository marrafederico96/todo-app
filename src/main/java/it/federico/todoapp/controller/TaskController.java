package it.federico.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.federico.todoapp.model.Task;
import it.federico.todoapp.service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskController {
    
    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getTask() {
        return taskService.getAllTask();
    }

    @GetMapping("/tasks/{title}")
    public List<Task> getTaskByTitle(@PathVariable String title) {
        return taskService.getTaskByTitle(title);
    }

    @PostMapping("/tasks/remove/{title}")
    public void removeTaskByTitle(@PathVariable String title) {
        taskService.removeTask(title);
    }

    @PostMapping("/tasks/create/{title}")
    public void addtask(@PathVariable String title) {
        taskService.createtask(title);
    }

}
