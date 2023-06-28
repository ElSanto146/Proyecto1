
package com.backendcabrera.cabrera.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(max = 50, message = "Hasta 50 caracteres")
    private String nombre;
    
    @NotNull
    @Size(max = 50, message = "Hasta 50 caracteres")
    private String apellido;
    
    
}
