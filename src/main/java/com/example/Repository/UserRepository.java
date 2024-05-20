package com.example.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Entity.UserModel;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addUser(UserModel userModel){
        System.out.println("EXCUTE INSERT MEMBER");
        jdbcTemplate.update("INSERT INTO login(username, password) "
                        + "VALUES (?,?)", userModel.getEmail(),userModel.getPassword() );
    }


}
