/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backendcabrera.cabrera.Interface;

import com.backendcabrera.cabrera.Entity.Persona;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface InterPersonaService {
    //traer una lista de persona
    public List<Persona> getPersona();
    
    //guardar un objeto tipo Persona
    public void savePersona (Persona persona);
    
    //Eliminar un objeto único atraves de id
    public void deletePersona(Long id);
    
    //Buscar un objeto persona por id
    public Persona findPersona(Long id);
}
