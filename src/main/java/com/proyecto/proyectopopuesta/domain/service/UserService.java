package com.proyecto.proyectopopuesta.domain.service;

import com.proyecto.proyectopopuesta.domain.User;
import com.proyecto.proyectopopuesta.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAll(){
        return userRepository.getAll();
    }
    public Optional<User> getUser (String userId){
        return userRepository.getUser(userId);

    }
    public  User save(User user){
        return userRepository.save(user);
    }
    /*
    public List<User> getByUser(String userId){
        return userRepository.getByUser(userId);
    }*/

}
