package com.jask.jask.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jask.jask.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
    
}
