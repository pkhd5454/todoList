package com.todolist.service;

import com.todolist.dto.TodoDTO;

import java.util.List;

public interface TodoService {
    void insertTodo(TodoDTO todoDTO);

    int deleteTodo(int tid);

    void updateTodo(TodoDTO todoDTO);

    TodoDTO selectTodo(int tid);

    List<TodoDTO> selectAllTodo();

    void toggle(int tid);

}
