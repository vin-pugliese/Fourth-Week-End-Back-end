package com.corso.java.controller;

import com.corso.java.domain.Consegna;
import com.corso.java.service.api.ConsegnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/weekend/consegna/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class ConsegnaController {

    @Autowired
    ConsegnaService consegnaService;

    @GetMapping(path="/{id}")
    ResponseEntity<Consegna> findById(@PathVariable String id) {
        Optional<Consegna> consegna = consegnaService.findById(id);
        return new ResponseEntity<Consegna>((Consegna) consegnaService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping(path="/")
    ResponseEntity<?> findAll() {
        return new ResponseEntity<>(consegnaService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping(path="/{id}")
    ResponseEntity<Void> deleteById(@PathVariable String id) {
        consegnaService.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Consegna> save(@RequestBody Consegna prodotto) {
        Consegna consegna1 = consegnaService.save(prodotto);
        return new ResponseEntity<>(consegna1, HttpStatus.OK);
    }


}
