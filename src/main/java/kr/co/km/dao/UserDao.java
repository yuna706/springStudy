package kr.co.km.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.km.vo.UserVo;

@Repository
public class UserDao {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public List<UserVo> selectUserList() throws Exception {
		return sqlSession.selectList("UserDao.selectUserList");
	}
	public UserVo selectUser(String name) throws Exception {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("name", name);
		return sqlSession.selectOne("UserDao.selectUser", paramMap);
	}
}
