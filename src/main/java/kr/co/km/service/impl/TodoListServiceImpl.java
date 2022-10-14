package kr.co.km.service.impl;

import kr.co.km.dao.TodoListDao;
import kr.co.km.service.TodoListService;
import kr.co.km.dto.TodoListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoListServiceImpl implements TodoListService {

	@Autowired
	TodoListDao todoListDao;

	@Override
	public List<TodoListDto> selectList(TodoListDto todoListDto) throws Exception {
		return todoListDao.selectList(todoListDto);
	}

	@Override
	public TodoListDto select(TodoListDto todoListDto) throws Exception {
		return todoListDao.select(todoListDto);
	}

	@Override
	public int insert(TodoListDto todoListDto) throws Exception {
		return todoListDao.insert(todoListDto);
	}

	@Override
	public int update(TodoListDto todoListDto) throws Exception {
		return todoListDao.update(todoListDto);
	}

	@Override
	public int delete(TodoListDto todoListDto) throws Exception {
		return todoListDao.delete(todoListDto);
	}
}
