/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Projecto_Integrador_Backend_DGBall.Service;

import com.Projecto_Integrador_Backend_DGBall.Entity.Experiencia;
import com.Projecto_Integrador_Backend_DGBall.repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Diego
 */
@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }
    
    public Optional<Experiencia> getOne(int id) {
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return rExperiencia.findByNombreE(nombreE);
    }
    
    public void save(Experiencia expe){
        rExperiencia.save(expe);
    }
    public void delete(int id){
            rExperiencia.deleteById(id);
    }
    
    public boolean existById(int id){
        return rExperiencia.existsById(id);
    }

    public boolean existByNombreE(String nombreE){
        return rExperiencia.existsByNombreE(nombreE);
    }
}

