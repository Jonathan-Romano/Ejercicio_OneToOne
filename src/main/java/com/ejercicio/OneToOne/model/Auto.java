
package com.ejercicio.OneToOne.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Auto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    private String marca;
    private String modelo;
    private String patente;
    private String anio;
    @OneToOne
    @JoinColumn ( name = "Id_propietario",
                referencedColumnName = "idPropietario")
    private Propietario propietario;

    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, String patente, String anio, Propietario propietario) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.anio = anio;
        this.propietario = propietario;
    }

   
    
}
