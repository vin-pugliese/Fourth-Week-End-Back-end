package com.corso.java.controller;

import com.corso.java.domain.Ordine;
import com.corso.java.service.api.OrdineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/weekend/ordine/v1")
public class OrdineController {

    @Autowired
    OrdineService ordineService;

    @GetMapping(path="/{id}")
    ResponseEntity<Ordine> findById(@PathVariable String id) {
        Optional<Ordine> ordine = ordineService.findById(id);
        return new ResponseEntity<Ordine>((Ordine) ordineService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping()
    ResponseEntity<?> findAll() {
        return new ResponseEntity<>(ordineService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Ordine> saveOne(@RequestBody Ordine ordine) {
        Ordine ordine1 = ordineService.save(ordine);
        return new ResponseEntity<>(ordine1, HttpStatus.OK);
    }

    @DeleteMapping(path="/{id}")
    ResponseEntity<Void> deleteOne(@PathVariable String id) {
        ordineService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}