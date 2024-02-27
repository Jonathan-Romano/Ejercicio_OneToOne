/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio.OneToOne.service;

import com.ejercicio.OneToOne.model.Propietario;
import com.ejercicio.OneToOne.repository.iPropietarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class propietarioService implements iPropietarioService{
    @Autowired  
    private iPropietarioRepository propiRepo;

    @Override
    public List<Propietario> traerPropietarios() {
        return propiRepo.findAll();    
    }

    @Override
    public Propietario traerPropietario(Long id) {
        return propiRepo.findById(id).orElse(null);    
    }

    @Override
    public String guardarPropietario(Propietario propietario) {
      propiRepo.save(propietario);
      return "Propietario Creado Correctamente";
    }

    @Override
    public String borrarPropietario(Long id) {
        propiRepo.deleteById(id);
        return "Propietario borrado correctamente";
    }

    @Override
    public Propietario editarPropietario(Long id, String marca, String nombre, String apellido, int edad) {
        Propietario propi = this.traerPropietario(id);
        propi.setNombre(nombre);
        propi.setApellido(apellido);
        propi.setEdad(edad);
        
        this.guardarPropietario(propi);
        
        return this.traerPropietario(id);
    }
    
    
}
