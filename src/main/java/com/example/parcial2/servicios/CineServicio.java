package com.example.parcial2.servicios;

import com.example.parcial2.Modelos.Cine;
import com.example.parcial2.repositorios.ICineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CineServicio{
    @Autowired
    private ICineRepositorio cineRepositorio;

    public Cine guardarCine(Cine cine){
        return cineRepositorio.save(cine);
    }
}