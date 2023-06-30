package com.proyecto.proyectopopuesta.persistence.crud;

import com.proyecto.proyectopopuesta.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrudRepository extends CrudRepository<Usuario,String> {
   // List<Usurious> findById(String usuarioId);


    //@Override
    //Optional<Usuario> findByUauarioId(String s);

}
