package com.samsl.webauth.services;

import com.samsl.onemarketsl.characters.User;
import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class UserService implements com.samsl.onemarketsl.services.UserService{
    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(int i) {
        return null;
    }

    @Override
    public User updateUser(int i, User user) {
        return null;
    }

    @Override
    public User deleteUser(int i) {
        return null;
    }
}
