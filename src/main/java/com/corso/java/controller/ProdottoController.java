package com.corso.java.controller;

import com.corso.java.domain.Prodotto;
import com.corso.java.service.api.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class ProdottoController {

    @Autowired
    ProdottoService prodottoService;

    @GetMapping(path="/{id}")
    ResponseEntity<Prodotto> findById(@PathVariable String id) {
        Optional<Prodotto> prodotto = prodottoService.findById(id);
        return new ResponseEntity<Prodotto>((Prodotto) prodottoService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping()
    ResponseEntity<?> findAll() {
        return new ResponseEntity<>(prodottoService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Prodotto> saveOne(@RequestBody Prodotto prodotto) {
        Prodotto prodotto1 = prodottoService.save(prodotto);
        return new ResponseEntity<>(prodotto1, HttpStatus.OK);
    }

    @DeleteMapping(path="/{id}")
    ResponseEntity<Void> deleteOne(@PathVariable String id) {
        prodottoService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}