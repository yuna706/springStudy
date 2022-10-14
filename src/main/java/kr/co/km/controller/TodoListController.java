package kr.co.km.controller;

import kr.co.km.dto.TodoListDto;
import kr.co.km.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/todoList")
public class TodoListController {

    @Autowired
    TodoListService todoListService;

    @GetMapping()
    public String todoList(HttpSession session) {
        if (session.getAttribute("name") == null) {
            return "redirect:/login";
        } else {
            return "todoList";
        }
    }

    @PostMapping()
    public @ResponseBody List<TodoListDto> getListTodoList(HttpSession session, @RequestBody TodoListDto todoListDto) throws Exception {
        int userSeq = (int) session.getAttribute("userSeq");
        todoListDto.setUserSeq(userSeq);
        return todoListService.selectList(todoListDto);
    }

    @GetMapping("/{boardSeq}")
    public @ResponseBody TodoListDto getTodoList(@RequestBody TodoListDto todoListDto, @PathVariable int boardSeq) throws Exception {
        todoListDto.setBoardSeq(boardSeq);
        return todoListService.select(todoListDto);
    }

    @PutMapping()
    public @ResponseBody int addTodoList(HttpSession session, @RequestBody TodoListDto todoListDto) throws Exception {
        int userSeq = (int) session.getAttribute("userSeq");
        todoListDto.setUserSeq(userSeq);
        return todoListService.insert(todoListDto);
    }

    @PatchMapping("/{boardSeq}")
    public @ResponseBody int modTodoLList(@RequestBody TodoListDto todoListDto, @PathVariable int boardSeq) throws Exception {
        todoListDto.setBoardSeq(boardSeq);
        return todoListService.update(todoListDto);
    }
}