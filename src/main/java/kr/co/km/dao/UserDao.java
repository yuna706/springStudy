package kr.co.km.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.km.vo.UserVo;

@Repository
public class UserDao {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public List<UserVo> selectUserList() throws Exception {
		return sqlSession.selectList("UserDao.selectUsersList");
	}
}
