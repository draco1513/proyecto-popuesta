package com.proyecto.proyectopopuesta.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
@Entity(name = "MAE_MENU")
public class Menu {
    @Id
    @Column(name="C_MENU_ID")
    private Integer menuId;
    @Column(name = "C_MENU_PADRE")
    private Integer menuPadre;
    @Column(name = "D_NOMBRE")
    private String nombre;
    @Column(name = "D_URL")
    private String url;
    @Column(name = "D_SIMBOLO")
    private  String simbolo;

    @Column(name = "C_MODULO_ID")
    private Integer moduloId;
    @Column(name = "C_MENU")
    private String menu;
//@OneToMany
    //@JoinColumn(name="id",insertable=false,updatable=false
    // private List<Usuario> usuarios;
    // '''''''''''''''''''''''

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuPadre() {
        return menuPadre;
    }

    public void setMenuPadre(Integer menuPadre) {
        this.menuPadre = menuPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Integer getModuloId() {
        return moduloId;
    }

    public void setModuloId(Integer moduloId) {
        this.moduloId = moduloId;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
