package kr.co.km.dao;

import kr.co.km.dto.TodoListDto;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoListDao {
    @Autowired
    SqlSessionTemplate sqlSession;

    public List<TodoListDto> selectList(TodoListDto todoListDto) throws Exception {
        return sqlSession.selectList("TodoListDao.selectList", todoListDto);
    }

    public TodoListDto select(TodoListDto todoListDto) throws Exception {
        return sqlSession.selectOne("TodoListDao.select", todoListDto);
    }

    public int insert(TodoListDto todoListDto) throws Exception {
        return sqlSession.insert("TodoListDao.insert", todoListDto);
    }

    public int update(TodoListDto todoListDto) throws Exception {
        return sqlSession.update("TodoListDao.update", todoListDto);
    }

    public int delete(TodoListDto todoListDto) throws Exception {
        return sqlSession.delete("TodoListDao.delete", todoListDto);
    }
}
