package com.engeto.restaurant;

public class Dish {
    private static int nextId = 1;
    private int id;
    private String title;
    private int price;
    private int quantity;
    private ImageUrl image1, image2;
    private int preparationTime;
    private Category category;
    private String description;




    public Dish(String title, int price, int quantity, int preparationTime, ImageUrl image1, ImageUrl image2, Category category, String description)  {
        this.id = nextId++;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.preparationTime = preparationTime;
        this.image1 = image1;
        this.image2 = image2;
        this.category = category;
        this.description = description;
    }

    public Dish(String title, int price, int quantity, int preparationTime, ImageUrl image1, Category category, String description)  {
        this.id = nextId++;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.preparationTime = preparationTime;
        this.image1 = image1;
        this.category = category;
        this.description = description;
    }


    public Dish() {
    }

    public Dish(String description) {
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

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
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

    public ImageUrl getImage1() {
        return image1;
    }

    public void setImage1(ImageUrl image1){
      this.image1 = image1;
    }

    public ImageUrl getImage2() {
        return image2;
    }

    public void setImage2(ImageUrl image2) {
        this.image2 = image2;
    }




    public String getDishInfo() {
        return getTitle() + " (" + getPrice() + " Kč)" +" doba přípravy " + getPreparationTime() + " min ";
    }


    @Override
    public String toString() {
        return  getId() + ". " + getTitle() + " " + getQuantity() + "x " + "(" + getQuantity()*getPrice() + " Kč)";
    }



}


