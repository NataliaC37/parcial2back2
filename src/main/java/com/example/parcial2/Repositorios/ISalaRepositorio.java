package com.example.parcial2.Repositorios;

import com.example.parcial2.Modelos.Cine;
import com.example.parcial2.Modelos.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ISalaRepositorio extends JpaRepository<Sala,Integer> {

    //Buscando un usuario por nombre exacto
    Optional<Sala> findByNombre(String nombre);

    //Buscando un usuario por correo
    Optional<Sala>findByCorreo(String correo);

    //Buscando todos los usuarios que tengan un nombre en especifico
    List<Sala> findByNombreContaining(String nombre);

    //Buscando los usuarios cuyo correo comience por :
    List<Sala>findByCorreoStartingWith(String correo);

}

