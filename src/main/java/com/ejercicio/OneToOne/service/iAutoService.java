
package com.ejercicio.OneToOne.service;

import com.ejercicio.OneToOne.model.Auto;
import com.ejercicio.OneToOne.model.Propietario;
import java.util.List;

public interface iAutoService {
    public List<Auto> traerAutos();
    public Auto traerAuto(Long id);   
    public String guardarAuto(Auto auto);
    public String borrarAuto(Long id);
    public Auto editarAuto(Long id, String marca, String modelo, String patente, String anio, Propietario propietario);

    public Auto editarAuto(Auto auto);
}
