package com.tiza.zz.service.user;

import com.tiza.zz.dao.user.UserMapper;
import com.tiza.zz.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper mapper;
	
	public int deleteUser(User user) {
		return mapper.deleteUser(user);
	}

	public User getUser(User user) {
		return mapper.getUser(user);
	}

	public List<User> getUserList() {
		return mapper.getUserList();
	}

	public int insertUser(User user) {
		return mapper.insertUser(user);
	}

	public int updateUser(User user) {
		return mapper.updateUser(user);
	}

}
