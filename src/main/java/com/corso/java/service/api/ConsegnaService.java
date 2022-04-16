package com.corso.java.service.api;

import com.corso.java.domain.Consegna;

import java.util.List;
import java.util.Optional;

public interface ConsegnaService {

    Optional findById(String id);
    List<Consegna> findAll();
    void deleteById(String id);
    Consegna save(Consegna consegna);
}
