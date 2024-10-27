package com.demo.Medicine.service;

import com.demo.Medicine_Shop.entities.User;
import java.util.List;

public interface UserService {
    User createUser(User user);	
    List<User> getAllUsers();
    User getUserById(int userId);
    User updateUser(int userId, User updatedUser);
    String deleteUser(String deleteUsername);
	String deleteUser(int userId);
}
