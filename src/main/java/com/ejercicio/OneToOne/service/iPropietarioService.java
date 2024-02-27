/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicio.OneToOne.service;

import com.ejercicio.OneToOne.model.Propietario;
import java.util.List;

public interface iPropietarioService {
    public List<Propietario> traerPropietarios();
    public Propietario traerPropietario(Long id);   
    public String guardarPropietario(Propietario propietario);
    public String borrarPropietario(Long id);
    public Propietario editarPropietario(Long id, String marca, String nombre, String apellido, int edad);
}
