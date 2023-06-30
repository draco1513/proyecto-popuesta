package com.proyecto.proyectopopuesta.domain.repository;

import com.proyecto.proyectopopuesta.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAll();
    Optional<User> getUser(String userId);
    User save(User user);
   // List<User> getByUser(String userId);
}
