/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Projecto_Integrador_Backend_DGBall.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    
    public dtoEducacion(){
    }
    
    public dtoEducacion(String nombreE, String descripcionE){
            this.nombreE = nombreE;
            this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescriptionE() {
        return descripcionE;
    }

    public void setDescriptionE(String descriptionE) {
        this.descripcionE = descriptionE;
    }
    
}
