package com.example.parcial2.Modelos.mapas;

import com.example.parcial2.Modelos.Cine;
import com.example.parcial2.Modelos.dtos.CineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaCineDTO {
    IMapaCineDTO INSTANCE= Mappers.getMapper(IMapaCineDTO.class);


    //Mapeando un modelo a DTO
    @Mapping(source="cine.id", target="id")
    @Mapping(source="cine.nombre", target="nombre")
    @Mapping(source="cine.nit", target="nit")

    CineDTO convertir_modelo_a_dto(Cine cine);

    //Mapeando una LISTA de datos del modelo
    //a una lista de datos de tipo DTO
    List<CineDTO> convertir_lista_a_dto(List<Cine>lista);

}