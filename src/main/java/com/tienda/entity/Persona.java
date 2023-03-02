package com.tienda.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="personas")
public class Persona implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String nom_artistico;
    private String nombre;
    private String apellido;
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom_artistico() {
        return nom_artistico;
    }

    public void setNom_artistico(String nom_artistico) {
        this.nom_artistico = nom_artistico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

    
    

    