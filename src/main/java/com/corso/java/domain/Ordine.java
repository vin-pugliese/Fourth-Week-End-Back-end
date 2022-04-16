package com.corso.java.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name ="orders")
public class Ordine {

    @Id
    private String id;

    private String client;

    public Ordine(){}

    public Ordine(String id, String client) {
        this.id = id;
        this.client = client;
    }

    public Ordine(String client) {
        this.client = client;
    }

    //-------------------Getters&Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
