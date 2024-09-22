package com.softtek.estudiantes.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estudiante")
@NoArgsConstructor
public class EstudianteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "creditos")
    private Integer creditos;
    @Column(name = "semestre")
    private Integer semestre;
    @Column(name = "promedio")
    private Integer promedio;


    public EstudianteEntity(Integer id, String nombre, String apellido, String email, Integer creditos, Integer semestre, Integer promedio) {
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