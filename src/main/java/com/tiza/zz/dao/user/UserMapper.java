package com.tiza.zz.dao.user;

import com.tiza.zz.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
	public List<User> getUserList();
	public User getUser(User user);
	public int insertUser(User user);
	public int deleteUser(User user);
	public int updateUser(User user);
	
}
