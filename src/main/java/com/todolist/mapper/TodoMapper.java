package com.todolist.mapper;

import com.todolist.dto.TodoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TodoMapper {
    void insertTodo(@Param("t") TodoDTO todoDTO);

    void updateTodo(@Param("t") TodoDTO todoDTO);

    int deleteTodo(int tid);

    TodoDTO selectTodo(int tid);

    List<TodoDTO> selectAllTodo();

    void toggleTodoState(int tid);
}
