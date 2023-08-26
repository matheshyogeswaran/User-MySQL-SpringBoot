package com.crud.user.service.BL;

import com.crud.user.model.User;

import java.util.List;

public interface UserServiceBL {
    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}
