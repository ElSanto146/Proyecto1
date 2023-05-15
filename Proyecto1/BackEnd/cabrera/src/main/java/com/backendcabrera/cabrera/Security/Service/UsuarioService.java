/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backendcabrera.cabrera.Security.Service;

import com.backendcabrera.cabrera.Security.Entity.Usuario;
import com.backendcabrera.cabrera.Security.Repository.iUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//Persistencia buscar el google para saber que hace. hace un rolback
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    //Comprueba si el nombre de usuario ya existe
    public boolean existByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    //Comprueba si el email existe
    public boolean existByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
    
    //Va a cargar un usuario nuevo
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }

}

