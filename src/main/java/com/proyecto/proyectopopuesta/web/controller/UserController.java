package com.proyecto.proyectopopuesta.web.controller;

import com.proyecto.proyectopopuesta.domain.User;
import com.proyecto.proyectopopuesta.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    public List<User> getAll()
    {
        return userService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id") String userId){
        return userService.getUser(userId);
    }
    public     User save(User user){
        return userService.save(user);
    }

    /*
    public List<User> getByUser(String userId){
        return userService.getByUser(userId);
    }*/
}
