package com.engeto.attributes;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    private static int nextId = 1;
    private int id;
    private String title;
    private Integer price;
    private Image image1, image2;
    private int preparationTime;
    private Category category;
    private String description;

    public static List<Image> imageList = new ArrayList<>();


    public Dish(String title, Integer price, int preparationTime, Image image1, Image image2, Category category, String description)  {
        this.id = nextId++;
        this.title = title;
        this.price = price;
        this.preparationTime = preparationTime;
        this.image1 = image1;
        this.image2 = image2;
        this.category = category;
        this.description = description;
    }

    public Dish(String title, Integer price, int preparationTime, Image image1, Category category, String description)  {
        this.id = nextId++;
        this.title = title;
        this.price = price;
        this.preparationTime = preparationTime;
        this.image1 = image1;
        this.category = category;
        this.description = description;
    }


    public Dish(String title) {
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Image getImage1() {
        return image1;
    }

    public void setImage1(Image image1){
      this.image1 = image1;
    }

    public Image getImage2() {
        return image2;
    }

    public void setImage2(Image image2) {
        this.image2 = image2;
    }

    public static List<Image> getImageList() {
        return imageList;
    }

    public static void setImageList(List<Image> imageList) {
        Dish.imageList = imageList;
    }


    public String getDishInfo() {
        return getTitle() + " (" + getPrice() + " Kč)" +" doba přípravy " + getPreparationTime() + " min ";
    }

    @Override
    public String toString() {
        return  getTitle() + " " + getDescription() + " " + getImage1();
    }



}


