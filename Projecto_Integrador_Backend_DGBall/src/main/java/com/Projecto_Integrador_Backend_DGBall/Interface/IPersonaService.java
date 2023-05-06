package com.Projecto_Integrador_Backend_DGBall.Interface;

import com.Projecto_Integrador_Backend_DGBall.Entity.Persona;
import java.util.List;


public interface IPersonaService { 
public List<Persona> getPersona();
public void savePersona(Persona persona);
public void deletePersona(Long id);
public Persona findPersona(Long id);
}