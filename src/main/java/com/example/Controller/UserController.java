package com.example.Controller;

import com.example.Entity.UserModel;
import com.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestParam("email") String email, @RequestParam("password") String password) {
        UserModel userModel = new UserModel();
        userModel.setEmail(email);
        userModel.setPassword(password);
        userService.addUser(userModel);
        return "redirect:/OSPS/login";
    }
}
