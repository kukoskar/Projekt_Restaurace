package com.engeto.attributes;

import java.time.LocalDateTime;

public class Attribut {
    private int id;
    private String title;
    private Double price;
    private int preparationTime;

    public Attribut(int id, String title, Double price, int preparationTime) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.preparationTime = preparationTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }
}
