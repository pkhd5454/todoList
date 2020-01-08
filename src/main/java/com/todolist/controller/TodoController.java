package com.todolist.controller;

import com.todolist.dto.TodoDTO;
import com.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping("/register")
    public String registerTodo(@RequestParam("contents") String contents) {
        TodoDTO todoDTO = new TodoDTO();
        todoDTO.setContents(contents);
        todoService.insertTodo(todoDTO);
        return "redirect:/home";
    }

    @GetMapping("/delete")
    public String deleteTodo(@RequestParam("tid") int tid) {
        todoService.deleteTodo(tid);
        return "redirect:/home";
    }

    @GetMapping("/view")
    public String viewTodo(@RequestParam("tid") int tid, Model model) {
        TodoDTO todoDTO = todoService.selectTodo(tid);
        model.addAttribute("todo", todoDTO);
        return "todoInfo";
    }

    @GetMapping("/modify")
    public String modifyTodo(@ModelAttribute TodoDTO todoDTO) {
        todoService.updateTodo(todoDTO);
        return "redirect:/home";
    }

    @GetMapping("/toggle")
    public String toggleTodo(@RequestParam("tid") int tid) {
        todoService.toggle(tid);
        return "redirect:/home";
    }
}
