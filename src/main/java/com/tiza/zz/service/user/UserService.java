package com.tiza.zz.service.user;

import com.tiza.zz.pojo.User;

import java.util.List;

public interface UserService {

	public List<User> getUserList();

	public User getUser(User user);

	public int insertUser(User user);

	public int deleteUser(User user);

	public int updateUser(User user);
}
