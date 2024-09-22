package com.softtek.estudiantes.domain.model;

import lombok.Getter;

@Getter
public class EstudianteModel {
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private Integer creditos;
    private Integer semestre;
    private Integer promedio;

    public EstudianteModel(
            Integer id,
            String nombre,
            String apellido,
            String email,
            Integer creditos,
            Integer semestre,
            Integer promedio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.creditos = creditos;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public Integer getPromedio() {
        return promedio;
    }
}
