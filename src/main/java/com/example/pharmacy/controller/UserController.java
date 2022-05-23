package com.example.pharmacy.controller;

import com.example.pharmacy.model.Users.BasicUser;
import com.example.pharmacy.model.Users.RequestUser;
import com.example.pharmacy.model.Users.UserFactory;
import com.example.pharmacy.servicelayer.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user_table")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Object> getUsers(){
        return userService.getUsers();
    }
    @PostMapping
    @ResponseBody
    public void addNewUser(RequestUser basicUser){
       // UserFactory userFactory = new UserFactory();
        //BasicUser b = userFactory.constructBasicUser(basicUser.getRole(),basicUser.getFirstName(), basicUser.getLastName(), basicUser.getEmailAddress(), basicUser.getPassword());
        userService.addNewUser(basicUser);
    }
    @DeleteMapping(path = "{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }
}
