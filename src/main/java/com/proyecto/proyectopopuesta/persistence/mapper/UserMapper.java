package com.proyecto.proyectopopuesta.persistence.mapper;

import com.proyecto.proyectopopuesta.domain.User;
import com.proyecto.proyectopopuesta.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings({
            @Mapping(source = "usuarioId",target = "userId"),
            @Mapping(source = "contrasenia",target = "pass"),
            @Mapping(source = "personaId",target = "personId"),
            @Mapping(source = "estado",target = "active"),
            @Mapping(source = "AUsuarioAdd",target = "userAdd"),
            @Mapping(source = "FUsuarioAdd",target = "dateUserAdd"),
            @Mapping(source = "usuarioMod",target = "userMod"),

            @Mapping(source = "FUsuarioMod",target = "dateUserMod"),
            @Mapping(source = "bContrasenia",target = "bPass"),
            @Mapping(source = "nDias",target = "numberDay"),
            @Mapping(source = "nBloqueo",target = "blockNumber"),
            @Mapping(source = "nivel",target = "level"),
    })
    User toUser(Usuario usuario);
    List<User> toUsers(List<Usuario> usuarios);
    @InheritInverseConfiguration
    Usuario toUsuario( User user);
    List<Usuario> toUsuarios(List<User> users);



}
