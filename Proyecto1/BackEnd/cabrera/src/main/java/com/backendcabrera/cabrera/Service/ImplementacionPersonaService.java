/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backendcabrera.cabrera.Service;

import com.backendcabrera.cabrera.Entity.Persona;
import com.backendcabrera.cabrera.Interface.InterPersonaService;
import com.backendcabrera.cabrera.Repository.InterPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos
 */
@Service
public class ImplementacionPersonaService implements InterPersonaService{
    @Autowired InterPersonaRepository interpersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = interpersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        interpersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        interpersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = interpersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
