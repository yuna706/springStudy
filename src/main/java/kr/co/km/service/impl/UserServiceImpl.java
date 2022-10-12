package kr.co.km.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.km.dao.UserDao;
import kr.co.km.service.UserService;
import kr.co.km.vo.UserVo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;

	@Override
	public List<UserVo> selectUserList() throws Exception {
		return userDao.selectUserList();
	}
}
