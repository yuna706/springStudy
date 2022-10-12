package kr.co.km.service;

import java.util.List;
import java.util.Map;

public interface UserService {

	public List<Map<String, Object>> selectUserList() throws Exception;
}
