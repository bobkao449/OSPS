package com.example.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.UserModel;
import com.example.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public void addUser(UserModel userModel){
        userRepository.addUser(userModel);
    }

}
