package com.proyecto.proyectopopuesta.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "TAB_USUARIO")
public class Usuario {
    @Id
    @Column(name = "C_USUARIO_ID")
    private String usuarioId;
    @Column(name = "D_CONTRASENIA")
    private String contrasenia;
    @Column(name = "C_PERSONA_ID")
    private Integer personaId;
    @Column(name = "E_ESTADO")
    private String estado;
    @Column(name = "C_USUARIO_ADD")
    private String AUsuarioAdd;
    @Column(name = "F_USUARIO_ADD")
    private Date FUsuarioAdd;
    @Column(name = "C_USUARIO_MOD")
    private String usuarioMod;
    @Column(name = "F_USUARIO_MOD")
    private String FUsuarioMod;
    @Column(name = "B_CONTRASENIA")
    private String bContrasenia;
    @Column(name = "NDIAS")
    private Integer nDias;
    @Column(name = "N_BLOQUEO")
    private Integer nBloqueo;
    @Column(name = "NIVEL")
    private Integer nivel;


    public String getUsuarioId() {
        return usuarioId;
    }

    public String getUsuarioMod() {
        return usuarioMod;
    }

    public void setUsuarioMod(String usuarioMod) {
        this.usuarioMod = usuarioMod;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAUsuarioAdd() {
        return AUsuarioAdd;
    }

    public void setAUsuarioAdd(String AUsuarioAdd) {
        this.AUsuarioAdd = AUsuarioAdd;
    }

    public Date getFUsuarioAdd() {
        return FUsuarioAdd;
    }

    public void setFUsuarioAdd(Date FUsuarioAdd) {
        this.FUsuarioAdd = FUsuarioAdd;
    }


    public String getFUsuarioMod() {
        return FUsuarioMod;
    }

    public void setFUsuarioMod(String FUsuarioMod) {
        this.FUsuarioMod = FUsuarioMod;
    }

    public String getbContrasenia() {
        return bContrasenia;
    }

    public void setbContrasenia(String bContrasenia) {
        this.bContrasenia = bContrasenia;
    }

    public Integer getnDias() {
        return nDias;
    }

    public void setnDias(Integer nDias) {
        this.nDias = nDias;
    }

    public Integer getnBloqueo() {
        return nBloqueo;
    }

    public void setnBloqueo(Integer nBloqueo) {
        this.nBloqueo = nBloqueo;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
