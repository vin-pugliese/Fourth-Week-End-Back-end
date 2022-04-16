package com.corso.java.service.api;

import com.corso.java.domain.Ordine;

import java.util.List;
import java.util.Optional;

public interface OrdineService {

    Optional findById(String id);
    List<Ordine> findAll();
    void deleteById(String id);
    Ordine save(Ordine ordine);
}
