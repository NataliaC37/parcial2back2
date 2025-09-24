package com.example.parcial2.Modelos.dtos;

public class CineDTO {
    private Integer id;
    private String nombre;
    private String nit;

    public CineDTO() {}

    public CineDTO(Integer id, String nombre, String nit) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
    }

    // Getters y setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }
}
