/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backendcabrera.cabrera.Repository;

import com.backendcabrera.cabrera.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carlos
 */

@Repository
public interface InterPersonaRepository extends JpaRepository<Persona,Long> {
    
}
 