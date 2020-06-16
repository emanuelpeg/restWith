package com.assembly.restjava.controller;

import com.assembly.restjava.dao.PersonaDAO;
import com.assembly.restjava.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonaController {

    @Autowired
    private PersonaDAO personaDAO;

    @GetMapping("/personas")
    public List<Persona> getPersonas() {
        return this.personaDAO.findAll();
    }

    @GetMapping("/persona/{id}")
    public Optional<Persona> getPersona(@PathVariable Long id) {
        return this.personaDAO.findById(id);
    }

    @PostMapping("/personas")
    public Persona save(@RequestBody Persona persona) {
        return this.personaDAO.save(persona);
    }

    @PutMapping("/personas")
    public Persona update(@RequestBody Persona persona) {
        if (this.personaDAO.existsById(persona.getId())) {
            return this.personaDAO.save(persona);
        }
        throw new RuntimeException("the id is not correct ");
    }
}
