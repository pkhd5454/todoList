package com.todolist.controller;

import com.todolist.dto.TodoDTO;
import com.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    TodoService todoService;

    @GetMapping("/home")
    public String home(Model model) {
        List<TodoDTO> list = todoService.selectAllTodo();
        model.addAttribute("todoList", list);
        return "home";
    }
}
