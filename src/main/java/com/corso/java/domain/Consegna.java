package com.corso.java.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deliveries")
public class Consegna {

    @Id
    private String id;

    private String indirizzo;

    public Consegna(){}

    public Consegna(String id, String indirizzo) {
        this.id = id;
        this.indirizzo = indirizzo;
    }

    public Consegna(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    //-------------------Getters&Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
