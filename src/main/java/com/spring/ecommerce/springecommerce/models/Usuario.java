package com.spring.ecommerce.springecommerce.models;

public class Usuario {

    public Usuario() {
    }

    public Usuario(int id, String nombre, String userName, String email, String direccion, String telefeno, String tipo, String password) {
        this.id = id;
        this.nombre = nombre;
        this.userName = userName;
        this.email = email;
        this.direccion = direccion;
        this.telefeno = telefeno;
        this.tipo = tipo;
        this.password = password;
    }

    private int id;
    private String nombre;
    private String userName;
    private String email;
    private String direccion;
    private String telefeno;
    private String tipo;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(String telefeno) {
        this.telefeno = telefeno;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
