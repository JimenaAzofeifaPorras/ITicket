package com.tienda.service;

import com.tienda.entity.Conciertos;
import com.tienda.repository.ConciertosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConciertosService implements IConciertosService{
    
    @Autowired
    private ConciertosRepository conciertosRepository;
    
    @Override
    public List<Conciertos> listConciertos(){
        return (List<Conciertos>)conciertosRepository.findAll(); }    
    }

