
package com.ejercicio.OneToOne.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Propietario {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long idPropietario;
    private String nombre;
    private String apellido;
    private int edad;

    public Propietario() {
    }

    public Propietario(Long id, String nombre, String apellido, int edad) {
        this.idPropietario = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
       
    
}
