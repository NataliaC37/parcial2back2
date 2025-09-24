package com.example.parcial2.Repositorios;

import com.example.parcial2.Modelos.Cine;
import com.example.parcial2.Modelos.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IDetalleCineRepositorio extends JpaRepository<DetalleCine,String> {
    //Buscando un usuario por nombre exacto
    Optional<DetalleCine> findByNombre(String nombre);

    //Buscando un usuario por correo
    Optional<DetalleCine>findByCorreo(String correo);

    //Buscando todos los usuarios que tengan un nombre en especifico
    List<DetalleCine> findByNombreContaining(String nombre);

    //Buscando los usuarios cuyo correo comience por :
    List<DetalleCine>findByCorreoStartingWith(String correo);

}
