package com.engeto.attributes;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Order extends Dish implements Assignable {


   private static int nextId = 1;

   private int id;

   private int table;

   private Dish dish;

   private Integer quantity;

    public List<Dish> dishes = new ArrayList<>();

   public DishList menuList = new DishList();

   public List<Order> orderList = new ArrayList<>();



   private int waiterNo;

   private LocalTime orderedTime;

   private LocalTime fulfilmentTime;

   private boolean orderInProgress;


    public Order(int table, int quantity, LocalTime orderedTime, LocalTime fulfilmentTime, int waiterNo, boolean orderInProgress, String description) {
        super(description);
        this.id = nextId++;
        this.table = table;

        this.quantity = quantity;
        this.waiterNo = waiterNo;
        this.orderedTime = orderedTime;
        this.fulfilmentTime = fulfilmentTime;
        this.orderInProgress = orderInProgress;

    }

    public Order(int table, LocalTime orderedTime, LocalTime fulfilmentTime, int waiterNo, String description) {
        this(table, 1, orderedTime, fulfilmentTime, waiterNo, true, description);
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWaiterNo() {
        return waiterNo;
    }

    public void setWaiterNo(int waiterNo) {
        this.waiterNo = waiterNo;
    }

    public LocalTime getOrderedTime() {
        return orderedTime;
    }

    public void setOrderedTime(LocalTime orderedTime) {
        this.orderedTime = orderedTime;
    }

    public LocalTime getFulfilmentTime() {
       return fulfilmentTime;
    }

    public void setFulfilmentTime(LocalTime fulfilmentTime) {
        this.fulfilmentTime = fulfilmentTime;
    }

    public boolean isOrderInProgress() {
        return orderInProgress;
    }

    public void setOrderInProgress(boolean orderInProgress) {
        this.orderInProgress = orderInProgress;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getDishPrice() {
        return Integer.valueOf(String.valueOf(getPrice() * getQuantity()));
    }


    @Override
    public String getOrderInfo() {
        return getTitle() + " (" + getDishPrice() + " Kč)" +" doba přípravy " + getPreparationTime() + " min ";
    }

    @Override
    public String toString() {
        return ( getId() + ". " + getTitle() + " (" + getQuantity() + "x)    " + getOrderedTime() + "-" + getFulfilmentTime() + " číšník č. "
                +  getWaiterNo() + " ");
    }



   }







