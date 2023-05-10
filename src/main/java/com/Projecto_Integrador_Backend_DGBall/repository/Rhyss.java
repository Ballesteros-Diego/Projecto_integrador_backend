/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Projecto_Integrador_Backend_DGBall.repository;

import com.Projecto_Integrador_Backend_DGBall.Entity.HySS;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Diego
 */
public interface Rhyss extends JpaRepository<HySS, Integer>{
    Optional<HySS> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
