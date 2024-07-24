package com.codegym.validate_formdangki.service;

import com.codegym.validate_formdangki.model.User;
import com.codegym.validate_formdangki.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepo userRepositoy;

    @Override
    public void save(User user) {
        userRepositoy.save(user);
    }
}
