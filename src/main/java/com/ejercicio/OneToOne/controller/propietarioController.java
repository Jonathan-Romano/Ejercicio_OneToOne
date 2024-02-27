
package com.ejercicio.OneToOne.controller;
import com.ejercicio.OneToOne.model.Propietario;
import com.ejercicio.OneToOne.service.iPropietarioService;
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
public class propietarioController {
    
    @Autowired
    private iPropietarioService propiServi;
    
    @GetMapping ("/propietarios/traer")
    public List<Propietario> listaPropietarios(){
        return propiServi.traerPropietarios();
    }
    
    @PostMapping ("/propietarios/{id}")
    public Propietario traerPropietario(@PathVariable Long id){
        return propiServi.traerPropietario(id);
    }
    
    @PostMapping ("/propietarios/crear")
    public String crearPropietario(@RequestBody Propietario Propietario){
        return propiServi.guardarPropietario(Propietario);
    }
    
    @DeleteMapping ("/propietarios/borrar/{id}")
    public String borrarPropietario(@PathVariable Long id){
        return propiServi.borrarPropietario(id);
    }
    
    @PutMapping ("/propietarios/editar/{id}")
    public Propietario editarPropietario(@PathVariable Long id,
                                    @RequestParam(required = false, name = "nombre") String nombre,
                                    @RequestParam(required = false, name = "apellido")String apellido,
                                    @RequestParam(required =false, name = "edad")int edad
                                    ){
        
        return propiServi.editarPropietario(id, nombre, nombre, apellido, edad);
    }
}
