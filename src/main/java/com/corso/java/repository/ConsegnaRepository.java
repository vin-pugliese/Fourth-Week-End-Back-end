package com.corso.java.repository;

import com.corso.java.domain.Consegna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsegnaRepository extends JpaRepository<Consegna, String> {
}

