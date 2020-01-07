package com.todolist.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TodoDTO {
    private int tid;
    private String title;
    private String content;
    private Date created_time;
    private Date modified_time;
    private boolean completed;

}
