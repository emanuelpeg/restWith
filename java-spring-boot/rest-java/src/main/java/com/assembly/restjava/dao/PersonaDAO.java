package com.assembly.restjava.dao;

import com.assembly.restjava.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDAO extends JpaRepository<Persona, Long> {
}
