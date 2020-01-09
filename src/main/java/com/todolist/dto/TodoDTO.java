package com.todolist.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TodoDTO {
    private int tid;
    private String contents;
    private LocalDateTime created_time;
    private LocalDateTime modified_time;
    private boolean completed;
}
