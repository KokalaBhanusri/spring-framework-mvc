package com.sample.Dao;

import com.sample.modal.Login;
import com.sample.modal.User;

public interface UserDao {
  int register(User user);
  User validateUser(Login login);
}