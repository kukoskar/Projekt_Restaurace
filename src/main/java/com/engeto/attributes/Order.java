package com.engeto.attributes;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Order extends ArrayList<Dish> implements Assignable {


   private static int nextId = 1;

   private int id;

   private int table;

   private Dish dish;

   public DishList dishList = new DishList();

   public List<Order> orderList = new ArrayList<>();

   private int quantity;

   private int waiterNo;

   private LocalTime orderedTime;

   private LocalTime fulfilmentTime;

   private boolean orderInProgress;


    public Order(int table, LocalTime orderedTime, LocalTime fulfilmentTime, int waiterNo, boolean orderInProgress) {
        this.id = nextId++;
        this.table = table;
        this.waiterNo = waiterNo;
        this.orderedTime = orderedTime;
        this.fulfilmentTime = fulfilmentTime;
        this.orderInProgress = orderInProgress;

    }

    public Order(int table, LocalTime orderedTime, LocalTime fulfilmentTime, int waiterNo) {
        this(table, orderedTime, fulfilmentTime, waiterNo, true);
    }



    public void setDishList(DishList dishList) {
        this.dishList = dishList;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public String getDishPrice() {
        return String.valueOf(dish.getPrice() * getQuantity());
    }


   /* @Override
    public String getOrderInfo() {
        return dish.getTitle() + " (" + dish.getPrice() + " Kč)" +" doba přípravy " + dish.getPreparationTime() + " min ";
    }*/

    @Override
    public String toString() {
        return (getId() + ". " + getOrderedTime() + "-" + getFulfilmentTime() + " číšník č. " +  getWaiterNo());
    }

    public void addDishWhatIsInMenuWithQuantity(Dish dish, int quantity, List<Dish> menuList) {
        for (Dish dish1 :
                menuList) {
            if (dish.equals(menuList)) {
                for (int i = 0; i < quantity; i++) {
                    menuList.add(dish);
                }
            } else {
                System.out.println("Toto jídlo není v menu.");
            }
        }
    }

    public String showMePriceOfOrder(){
        int celkovaCena=0;
        for (Dish dish :
                dishList) {
            celkovaCena += dish.getPrice();
        }
        return "Celková cena objednávky je: "+celkovaCena;
    }


    @Override
    public String getOrderInfo() {
        return (getId() + ". "  + getOrderedTime() + "-" + getFulfilmentTime() + " číšník č. " +  getWaiterNo());
    }
}




