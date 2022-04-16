package com.corso.java.service;

import com.corso.java.domain.Prodotto;
import com.corso.java.repository.ProdottoRepository;
import com.corso.java.service.api.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdottoServiceImpl implements ProdottoService{

    @Autowired
    ProdottoRepository prodottoRepository;

    @Override
    public Optional<Prodotto> findById(String id) {
        return prodottoRepository.findById(id);
    }

    @Override
    public List<Prodotto> findAll() {
        return prodottoRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        prodottoRepository.deleteById(id);
    }

    @Override
    public Prodotto save(Prodotto prodotto) {
        return prodottoRepository.save(prodotto);
    }


}
