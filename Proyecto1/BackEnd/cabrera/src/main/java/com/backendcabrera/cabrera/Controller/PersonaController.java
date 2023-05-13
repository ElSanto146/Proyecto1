/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backendcabrera.cabrera.Controller;

import com.backendcabrera.cabrera.Entity.Persona;
import com.backendcabrera.cabrera.Interface.InterPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carlos
 */

@RestController
public class PersonaController {
    @Autowired InterPersonaService interpersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return interpersonaService.getPersona();
    }
    
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        interpersonaService.savePersona(persona);
        return "El usuario fue creado con éxito";
    }
    
    
    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interpersonaService.deletePersona(id);
        return "Usuario eliminado";
    }
    
    //URL:Puerto/persona/editar/4/nombre y apellido
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido){
        Persona persona = interpersonaService.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        
        interpersonaService.savePersona(persona);
        return persona;
    }
}
