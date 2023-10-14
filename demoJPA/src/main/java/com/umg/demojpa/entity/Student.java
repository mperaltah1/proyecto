package com.umg.demojpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Table(name = "alumno")
@Entity
@Data
public class Student {
    @Id
    @Column(name = "carne")
    private Integer carne;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fechaNac")
    private LocalDate fechaNac;
}
