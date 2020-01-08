package com.todolist;

import com.todolist.dto.TodoDTO;
import com.todolist.service.Impl.TodoServiceImpl;
import com.todolist.service.TodoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoServiceTests {
    @Autowired
    TodoService todoService;

    /*@Test
    public void insertTest() {
        TodoDTO dto = new TodoDTO();
        dto.setContents("서비스 테스트2");
        todoService.insertTodo(dto);
    }*/

    /*@Test
    public void updateTest() {
        TodoDTO dto = new TodoDTO();
        dto.setTid(12);
        dto.setCreated_time(new Date());
        dto.setCompleted(true);
        dto.setContents("수정 테스트");
        todoService.updateTodo(dto);
    }*/

    @Test
    public void selectTest() {
        TodoDTO dto = todoService.selectTodo(11);
        System.out.println(dto.getContents());

        List<TodoDTO> list = todoService.selectAllTodo();
        System.out.println(list.get(0).getContents());
        System.out.println(list.get(1).getContents());
    }
}
