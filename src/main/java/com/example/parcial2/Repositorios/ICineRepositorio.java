package com.example.parcial2.Repositorios;

import com.example.parcial2.Modelos.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICineRepositorio extends JpaRepository<Cine,Integer> {
    //Espacio donde se personalizan las consultas en SQL (DISTINTAS A LAS 5 BASICAS)

    //Buscando un usuario por nombre exacto
    Optional<Cine> findByNombre(String nombre);

    //Buscando un usuario por correo
    Optional<Cine>findByCorreo(String correo);

    //Buscando todos los usuarios que tengan un nombre en especifico
    List<Cine> findByNombreContaining(String nombre);

    //Buscando los usuarios cuyo correo comience por :
    List<Cine>findByCorreoStartingWith(String correo);


}

