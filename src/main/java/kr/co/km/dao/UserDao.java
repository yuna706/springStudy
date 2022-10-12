package kr.co.km.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public List<Map<String, Object>> selectUserList() throws Exception {
		return sqlSession.selectList("UserDao.selectUsersList");
	}
}
