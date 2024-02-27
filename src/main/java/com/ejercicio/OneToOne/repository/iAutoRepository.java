
package com.ejercicio.OneToOne.repository;

import com.ejercicio.OneToOne.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iAutoRepository extends JpaRepository<Auto, Long>{
    
}
