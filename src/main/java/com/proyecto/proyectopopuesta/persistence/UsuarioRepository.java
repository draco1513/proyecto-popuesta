package com.proyecto.proyectopopuesta.persistence;

import com.proyecto.proyectopopuesta.domain.User;
import com.proyecto.proyectopopuesta.domain.repository.UserRepository;
import com.proyecto.proyectopopuesta.persistence.crud.UsuarioCrudRepository;
import com.proyecto.proyectopopuesta.persistence.entity.Usuario;
import com.proyecto.proyectopopuesta.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class UsuarioRepository implements UserRepository
{
    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;
    @Autowired
    private UserMapper mapper;
    @Override
    public List<User> getAll() {
        List<Usuario> usurious=(List<Usuario>) usuarioCrudRepository.findAll();
        return mapper.toUsers(usurious);
    }
    @Override
    public Optional<User> getUser(String userId) {
        return usuarioCrudRepository.findById(userId).map(usuario -> mapper.toUser( usuario));
    }

    @Override
    public User save(User user) {
        Usuario usuario=mapper.toUsuario(user);
        return mapper.toUser(usuarioCrudRepository.save(usuario));
    }








    //delete no lo implemento deberia ser um cambio de estadp
}
