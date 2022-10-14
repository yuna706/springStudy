package kr.co.km.service;

import java.util.List;
import java.util.Map;

import kr.co.km.vo.UserVo;

public interface UserService {

	List<UserVo> selectUserList() throws Exception;
	UserVo selectUser(String name) throws Exception;
}
