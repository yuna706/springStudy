package kr.co.km.service;

import kr.co.km.dto.TodoListDto;

import java.util.List;

public interface TodoListService {
    List<TodoListDto> selectList(TodoListDto todoListDto) throws Exception;
    TodoListDto select(TodoListDto todoListDto) throws Exception;
    int insert(TodoListDto todoListDto) throws Exception;
    int update(TodoListDto todoListDto) throws Exception;
    int delete(TodoListDto todoListDto) throws Exception;
}
