package com.example.tasktracker;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    List<String> tasks = new ArrayList<>();

    @GetMapping("/")
    public String home() {
        return "Daily Task Tracker Running";
    }

    @GetMapping("/tasks")
    public List<String> getTasks() {
        return tasks;
    }

    @GetMapping("/add")
    public String addTask(@RequestParam String task) {
        tasks.add(task);
        return "Task Added";
    }

    @GetMapping("/delete")
    public String deleteTask(@RequestParam int index) {
        tasks.remove(index);
        return "Task Deleted";
    }
}
