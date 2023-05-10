/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Projecto_Integrador_Backend_DGBall.Security.Service;

import com.Projecto_Integrador_Backend_DGBall.Entity.HySS;
import com.Projecto_Integrador_Backend_DGBall.repository.Rhyss;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Diego
 */
@Transactional
@Service



public class SecHySS {
    @Autowired
    Rhyss rhyss;
    
    public List<HySS> list(){
        return rhyss.findAll();
    }
    
    public Optional<HySS> getOne(int id){
        return rhyss.findById(id);    
    }
    
    public Optional<HySS> getByNombre(String nombre){
        return rhyss.findByNombre(nombre);    
    }
    
    public void save (HySS skill){
        rhyss.save(skill);    
    }
    
    public void delete (int id){
        rhyss.deleteById(id);    
    }
    
    public boolean existById(int id){
            return rhyss.existsById(id);
    }
    
    public boolean existByNombre(String nombre){
            return rhyss.existsByNombre(nombre);
    }
    
}
