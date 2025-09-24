package com.example.parcial2.servicios;

import com.example.parcial2.Modelos.DetalleCine;
import com.example.parcial2.repositorios.IDetalleCineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleCineServicio {

    @Autowired
    private IDetalleCineRepositorio repositorio;

    public DetalleCine guardarDetalleCine(DetalleCine detalle) {
        return repositorio.save(detalle);
    }
}

