package com.tienda.repository;
import com.tienda.entity.Conciertos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConciertosRepository extends CrudRepository<Conciertos,Long>{

    
}
