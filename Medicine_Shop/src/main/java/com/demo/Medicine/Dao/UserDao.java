package com.demo.Medicine.Dao;

import com.demo.Medicine_Shop.entities.User;
import java.util.List;

public interface UserDao {
    User createUser(User user);	
    List<User> getAllUsers();
    User getUserById(int userId);
    User updateUser(int userId, User updatedUser);
    String deleteUser(int userId);
}