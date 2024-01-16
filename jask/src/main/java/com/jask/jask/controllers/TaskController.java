package com.jask.jask.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jask.jask.model.Task;
import com.jask.jask.model.TaskDto;
import com.jask.jask.services.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    
    @Autowired
    private TaskService taskService;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<?> saveTask(@RequestBody TaskDto taskDto){
        Task task = modelMapper.map(taskDto, Task.class);

        taskService.save(task);
        
        return ResponseEntity.ok().body(taskDto);
    }

    @GetMapping
    public ResponseEntity<?> findAllTasks(){
        List<Task> list = taskService.findAll();
        return ResponseEntity.ok().body(list);        
     }

}
