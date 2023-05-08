/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Projecto_Integrador_Backend_DGBall.Security.Service;

import com.Projecto_Integrador_Backend_DGBall.Security.Entity.Rol;
import com.Projecto_Integrador_Backend_DGBall.Security.Enums.RolNombre;
import com.Projecto_Integrador_Backend_DGBall.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    return irolRepository.findByRolNombre(rolNombre);}
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
