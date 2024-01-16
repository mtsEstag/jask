package com.jask.jask.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jask.jask.model.Task;
import com.jask.jask.repositories.TaskRepository;

@Service
public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;

    public void save(Task task){
        taskRepository.save(task);        
    }

    public List<Task> findAll(){        
        return taskRepository.findAll();
    }
}
