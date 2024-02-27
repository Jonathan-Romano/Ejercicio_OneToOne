package com.ejercicio.OneToOne.controller;

import com.ejercicio.OneToOne.model.Auto;
import com.ejercicio.OneToOne.model.Propietario;
import com.ejercicio.OneToOne.service.iAutoService;
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

@RestController
public class autoController {

    @Autowired
    private iAutoService autoServi;

    @GetMapping("/autos/traer")
    public List<Auto> listaAuto() {
        return autoServi.traerAutos();
    }

    @PostMapping("/autos/{id}")
    public Auto buscarAuto(@PathVariable Long id) {
        return autoServi.traerAuto(id);
    }

    @PostMapping("/autos/crear")
    public String crearAuto(@RequestBody Auto auto) {
        return autoServi.guardarAuto(auto);
    }

    @DeleteMapping("/autos/borrar/{id}")
    public String borrarAuto(@PathVariable Long id) {
        return autoServi.borrarAuto(id);
    }

    @PutMapping("/autos/editar/{id}")
    public Auto editarAuto(@PathVariable Long id,
                        @RequestParam(required = false, name = "marca") String marca,
                        @RequestParam(required = false, name = "modelo") String modelo,
                        @RequestParam(required = false, name = "patente") String patente,
                        @RequestParam(required = false, name = "anio") String anio,
                        @RequestBody Propietario propietario
                        ) {

        return autoServi.editarAuto(id, marca, modelo, patente, anio, propietario);
    }

    @PutMapping("/autos/editar")
    public Auto editarAuto(@RequestBody Auto auto) {

        return autoServi.editarAuto(auto);
    }

}
