package com.Projecto_Integrador_Backend_DGBall.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No se cumple la condición")
private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No se cumple la condición")
private String apellido;

public Persona(){
}

public Persona(Long id, String nombre, String apellido){
this.id = id;
this.nombre = nombre;
this.apellido = apellido;
}

    public void setImg(String nuevoImg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNombre(String nuevoNombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setApellido(String nuevoApellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}