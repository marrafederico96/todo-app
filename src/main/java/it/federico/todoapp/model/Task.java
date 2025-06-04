package it.federico.todoapp.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID taskID;
    @NotBlank
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private boolean completed;

    public Task() {
        this.completed = false;
    }

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public UUID getTaskID() {
        return taskID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
