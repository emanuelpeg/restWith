package com.assembly.restjava.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Personas")
public class Persona {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name="dni", nullable = false)
    private Long dni;

    @Column(name="name", length = 100, nullable = false)
    private String name;

    @Column(name="surname", length = 100, nullable = false)
    private String surname;

    protected Persona() {    }

    public Persona(long dni) {
        this.dni = dni;
    }

    public Persona(long dni, String name, String surname) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
