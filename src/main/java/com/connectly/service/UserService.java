package com.connectly.service;

import java.util.List;

import com.connectly.exceptions.UserException;
import com.connectly.models.User;

public interface UserService {

	public User registerUser(User user);
	public User findUserbyId(Integer userId) throws UserException;
	public User findUserByEmail(String email);
	public User followUser(Integer userId1, Integer userId2) throws UserException;
	public User updateUser(User user, Integer userId) throws UserException;
	public List<User>searchUser(String query);
	public User findUserByJwt ( String jwt);
}
