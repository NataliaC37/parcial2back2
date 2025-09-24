package com.example.parcial2.Modelos;

import jakarta.persistence.*;

@Entity
public class DetalleCine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String direccion;
    private String telefono;

    @OneToOne
    @JoinColumn(name = "cine_id")
    private Cine cine;

    public DetalleCine() {}

    public DetalleCine(String direccion, String telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}

