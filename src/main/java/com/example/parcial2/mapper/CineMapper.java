package com.example.parcial2.mapper;

class CineDTO {
    private Long id;
    private String nombre;
    private String nit;

    // Constructor vacío
    public CineDTO() {}

    // Constructor con parámetros
    public CineDTO(Long id, String nombre, String nit) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
