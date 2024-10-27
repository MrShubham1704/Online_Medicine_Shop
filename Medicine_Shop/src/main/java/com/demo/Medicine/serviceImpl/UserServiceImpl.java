package com.demo.Medicine.serviceImpl;

import com.demo.Medicine.Dao.UserDao;
import com.demo.Medicine.DaoImpl.UserDaoImpl;
import com.demo.Medicine.service.UserService;
import com.demo.Medicine_Shop.entities.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    // Dependency on UserDao
    private UserDao userDao = new UserDaoImpl();

    @Override
    public User createUser(User user) {
        // Invoke UserDaoImpl method to save the user object
        return userDao.createUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        // Invoke UserDaoImpl method to retrieve all users
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(int userId) {
        // Invoke UserDaoImpl method to retrieve a specific user by userId
        return userDao.getUserById(userId);
    }

    @Override
    public User updateUser(int userId, User updatedUser) {
        // Invoke UserDaoImpl method to update the user's details
        return userDao.updateUser(userId, updatedUser);
    }

    @Override
    public String deleteUser(int userId) {
        // Invoke UserDaoImpl method to delete a user by userId
        return userDao.deleteUser(userId);
    }

	@Override
	public String deleteUser(String deleteUsername) {
		// TODO Auto-generated method stub
		return null;
	}
}
