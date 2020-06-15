package com.sample.service;

import com.sample.modal.Login;
import com.sample.modal.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
