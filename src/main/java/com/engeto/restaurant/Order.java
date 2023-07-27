package com.engeto.restaurant;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Order extends Dish {


   private static int nextId = 1;

   private int id;

   private int table;

   private Dish dish;

   private List<Dish> menuList = new ArrayList<>();

   private List<Order> orderList = new ArrayList<>();


   private int waiterNo;

   private LocalTime orderedTime;

   private LocalTime fulfilmentTime;

   private boolean orderInProgress;




    public Order(int table, Dish dish, LocalTime orderedTime, LocalTime fulfilmentTime, int waiterNo, boolean orderInProgress) {
        this.id = nextId++;
        this.table = table;
        this.dish = dish;
        this.waiterNo = waiterNo;
        this.orderedTime = orderedTime;
        this.fulfilmentTime = fulfilmentTime;
        this.orderInProgress = orderInProgress;

    }

    public Order(int table, Dish dish, LocalTime orderedTime, LocalTime fulfilmentTime, int waiterNo) {
        this(table, dish, orderedTime, fulfilmentTime, waiterNo, true);
    }

    public Order(){
    }

    public void addDishWhatIsInMenuWithQuantity(Dish dish, int quantity, List<Dish> menuList) {
        for (Dish dish1 : menuList) {
            if (dish.equals(menuList)) {
                for (int i = 0; i < quantity; i++) {
                    menuList.add(dish);
                }
            } else {
                System.out.println("Toto jídlo není v menu.");
            }
        }
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

    public List<Dish> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Dish> menuList) {
        this.menuList = menuList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public LocalTime getFulfilmentTime() {
       return fulfilmentTime;
    }

    public void setFulfilmentTime(LocalTime fulfilmentTime) {
        this.fulfilmentTime = fulfilmentTime;
    }


    public void setOrderInProgress(boolean orderInProgress) {
        this.orderInProgress = orderInProgress;
    }

    public boolean isOrderInProgress() {
        return orderInProgress;
    }


    public String orderWithoutPrice() {
        return ( getId() + ". " + dish.getTitle() + " (" + dish.getQuantity() + "x)    " + "(" + (dish.getQuantity()* dish.getPrice()) + " Kč)" +
                getOrderedTime() + "-" + getFulfilmentTime() + " číšník č. "
                +  getWaiterNo() + " ");
    }

    @Override
    public String toString() {
        return ( getId() + ". " + dish.getTitle() + " (" + dish.getQuantity() + "x)   " + "(" + (dish.getQuantity()* dish.getPrice()) + " Kč)" +
                getOrderedTime() + "-" + getFulfilmentTime() + " číšník č. " +  getWaiterNo() + " ");
    }



   }







