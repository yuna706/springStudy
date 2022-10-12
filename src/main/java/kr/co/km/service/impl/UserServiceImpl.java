package kr.co.km.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.km.dao.UserDao;
import kr.co.km.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;

	@Override
	public List<Map<String, Object>> selectUserList() throws Exception {
		// TODO Auto-generated method stub
		return userDao.selectUserList();
	}
}
