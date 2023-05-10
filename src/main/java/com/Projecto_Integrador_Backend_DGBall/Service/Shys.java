/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Projecto_Integrador_Backend_DGBall.Service;

import com.Projecto_Integrador_Backend_DGBall.Entity.HySS;
import com.Projecto_Integrador_Backend_DGBall.repository.Rhyss;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class Shys {
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
    
    public void save(HySS skill){
        rhyss.save(skill);
    }
    
    public void delete(int id){
        rhyss.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rhyss.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rhyss.existsByNombre(nombre);
    }
}
