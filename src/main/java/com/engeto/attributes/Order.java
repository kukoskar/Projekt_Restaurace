package com.engeto.attributes;

import java.time.LocalTime;
import java.util.List;


public class Order extends Dish {


   private static int nextId = 1;

   private int id;

   private int table;

   private Dish dish;

   private Integer quantity;

   public DishList menuList = new DishList();

   private int waiterNo;

   private LocalTime orderedTime;

   private LocalTime fulfilmentTime;

   private boolean orderInProgress;


    public Order(int table, Dish dish, int quantity, LocalTime orderedTime, LocalTime fulfilmentTime, int waiterNo, boolean orderInProgress, String description) {
        super(description);
        this.id = nextId++;
        this.table = table;
        this.dish = dish;
        this.quantity = quantity;
        this.waiterNo = waiterNo;
        this.orderedTime = orderedTime;
        this.fulfilmentTime = fulfilmentTime;
        this.orderInProgress = orderInProgress;

    }

    public Order(int table, Dish dish, LocalTime orderedTime, LocalTime fulfilmentTime, int waiterNo, String description) throws DishException {
        this(table, dish, 1, orderedTime, fulfilmentTime, waiterNo, true, description);
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
                menuList) {
            celkovaCena += dish.getPrice();
        }
        return "Celková cena objednávky je: "+celkovaCena;
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
    public String toString() {
        return ( getId() + ". " + dish.getTitle() + " (" + getQuantity() + "x)    " + getOrderedTime() + "-" + getFulfilmentTime() + " číšník č. "
                +  getWaiterNo() + " ");
    }



   }







