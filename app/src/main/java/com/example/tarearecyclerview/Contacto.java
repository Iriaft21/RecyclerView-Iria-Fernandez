package com.example.tarearecyclerview;

public class Contacto {

    private int foto;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;

    public Contacto(String nombre, int foto, String apellidos, String email, String telefono) {
        this.nombre = nombre;
        this.foto = foto;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto foto " + foto + ", nombre='" + nombre +", apellidos='" + apellidos + ", email='" + email +", telefono='" + telefono;
    }
}
