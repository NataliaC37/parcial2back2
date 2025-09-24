package com.example.parcial2.servicios;

import com.example.parcial2.Modelos.Sala;
import com.example.parcial2.repositorios.ISalaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaServicio {

    @Autowired
    private ISalaRepositorio repositorio;

    public Sala guardarSala(Sala sala) {
        return repositorio.save(sala);
    }
}


