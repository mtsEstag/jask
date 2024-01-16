package com.jask.jask.model;

import java.sql.Date;

import lombok.Data;
@Data
public class TaskDto {

    private String title;
    private String description;
    private Date creationDate;
    private Status status;

}
