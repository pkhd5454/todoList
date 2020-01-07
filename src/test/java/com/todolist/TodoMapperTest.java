package com.todolist;

import com.mysql.cj.log.Log;
import com.todolist.dto.TodoDTO;
import com.todolist.mapper.TodoMapper;
import com.todolist.service.TodoService;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoMapperTest {
    @Autowired
    TodoMapper mapper;

    /*@Test
    public void insertTest() {
        TodoDTO todoDTO = new TodoDTO();
        todoDTO.setContent("내용8");
        todoDTO.setTitle("제목8");
        todoDTO.setPriority(1);
        mapper.insertTodo(todoDTO);
        System.out.println("=================================");

        System.out.println("=================================");
    }*/

    /*@Test
    public void updateTest() {
        TodoDTO todoDTO = new TodoDTO();
        todoDTO.setTitle("제목 수정");
        todoDTO.setContent("내용 수정");
        todoDTO.setPriority(3);
        todoDTO.setTid(3);
        todoDTO.setCreated_time(new Date());
        mapper.updateTodo(todoDTO);
    }*/

    /*@Test
    public void deleteTest() {
        mapper.deleteTodo(5);
    }*/

    /*@Test
    public void selectTest() {
        TodoDTO dto = mapper.selectTodo(1);
        System.out.println(dto.getTitle());
        System.out.println(dto.getContent());
    }*/

    /*@Test
    public void selectAllTest() {
        List<TodoDTO> list = mapper.selectAllTodo();
        System.out.println(list.size());
    }*/

    /*@Test
    public void selectListByPriorityTest() {
        List<TodoDTO> list = mapper.selectTodoWithPriority(1);
        System.out.println(list.size());
    }*/

    @Test
    public void toggleTodo() {
        mapper.toggleTodo(10);
    }


}
