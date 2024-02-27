package com.ejercicio.OneToOne.service;

import com.ejercicio.OneToOne.model.Auto;
import com.ejercicio.OneToOne.model.Propietario;
import com.ejercicio.OneToOne.repository.iAutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class autoService implements iAutoService {

    @Autowired
    private iAutoRepository autoRepo;

    @Override
    public List<Auto> traerAutos() {
       return autoRepo.findAll();
    }

    @Override
    public Auto traerAuto(Long id) {
        return autoRepo.findById(id).orElse(null);
    }

    @Override
    public String guardarAuto(Auto auto) {
        autoRepo.save(auto);
        return "auto creado correctamente";
    }

    @Override
    public String borrarAuto(Long id) {
        autoRepo.deleteById(id);
        return "Auto Borrado Correctamente";
    }

    @Override
    public Auto editarAuto(Long id, String marca, String modelo, String patente, String anio, Propietario propietario) {
        Auto auto = this.traerAuto(id);
        if(marca !=null){
          auto.setMarca(marca);
        }
        if(modelo !=null){
          auto.setModelo(modelo);
        }
        if(patente !=null){
          auto.setPatente(patente);
        }
        if(anio !=null){
          auto.setAnio(anio);
        }
        if(propietario !=null){
         auto.setPropietario(propietario);
        }
        this.guardarAuto(auto);
        
        return this.traerAuto(id);
    }

    @Override
    public Auto editarAuto(Auto auto) {
       this.guardarAuto(auto);
       
       return this.traerAuto(auto.getId());
    }

}
