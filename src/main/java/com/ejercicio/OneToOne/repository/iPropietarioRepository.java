
package com.ejercicio.OneToOne.repository;

import com.ejercicio.OneToOne.model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iPropietarioRepository extends JpaRepository<Propietario, Long>{
    
}
