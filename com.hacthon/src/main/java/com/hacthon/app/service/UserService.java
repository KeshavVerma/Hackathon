package com.hacthon.app.service;

import com.hacthon.app.modal.User;
import com.hacthon.app.modal.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
