package com.todolist.service.Impl;

import com.todolist.dto.TodoDTO;
import com.todolist.mapper.TodoMapper;
import com.todolist.service.TodoService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoMapper todoMapper;

    @Override
    public void insertTodo(TodoDTO todoDTO) {
        todoMapper.insertTodo(todoDTO);
    }

    @Override
    public int deleteTodo(int tid) {
        return todoMapper.deleteTodo(tid);
    }

    @Override
    public void updateTodo(TodoDTO todoDTO) {
        todoMapper.updateTodo(todoDTO);
    }

    @Override
    public TodoDTO selectTodo(int tid) {
        return todoMapper.selectTodo(tid);
    }

    @Override
    public List<TodoDTO> selectAllTodo() {
        return todoMapper.selectAllTodo();
    }

    @Override
    public void toggle(int tid) {
        todoMapper.toggleTodo(tid);
    }
}
