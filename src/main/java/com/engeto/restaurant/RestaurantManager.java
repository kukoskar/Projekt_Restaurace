package com.engeto.restaurant;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    private List<Order> orderList = new ArrayList<>();
    private List<Dish> menuList = new ArrayList<>();
    private Dish dish;

    private Order order;

    public Integer totalSpend(){
        Integer utrataCelkem = 0;
        for (Order order: this.orderList){
            for (Dish dish: order.getMenuList()){
                utrataCelkem += dish.getPrice() * dish.getQuantity();
            }
        }
        return utrataCelkem;
    }

    public Integer waiterOrderPrice(Integer waiter){
        Integer utrata=0;
        for (Order order : this.orderList) {
            if (order.getWaiterNo() == waiter)
                for (Dish dish : order.getMenuList())
                    utrata += dish.getPrice() * dish.getQuantity();
        }
        return utrata;
    }

    public String orderTable(Integer tableNum){
        String table="";
        int lineNumber = 0;
        for (Order order : this.orderList) {
            lineNumber++;
            if (order.getTable() == tableNum)
                for (Dish dish : order.getMenuList())
                    table +=  lineNumber + ". " + order.orderInfo() + "\n";
        }
        return table;
    }



    public void saveToFile(String filename, String delimeter) throws DishException {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)))) {
           for (Order order : orderList) {
                String record =
                         order.getDish()+delimeter
                      //     +dish.getQuantity()+delimeter
                    //       +" (" + (dish.getPrice()* dish.getQuantity() +" Kč)")+":"+delimeter
                           +order.getOrderedTime()+"-"+order.getFulfilmentTime()+delimeter
                          +"číšník č. "+ order.getWaiterNo();
                writer.println(record);
            }
        } catch (IOException e) {
            throw new DishException("Došlo k chybě při zápisu do souboru "+filename+ ": " + e.getLocalizedMessage() );
        }
    }



     public String orderInProgress(List<Order> orderList) {
        int orderInPrg=0;
        for (Order order: orderList) {
            if (order.isOrderInProgress()) {
                orderInPrg++;
            }
        }
        return ("Nedokončené objednávky: "+ orderInPrg);
    }


    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Dish> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Dish> menuList) {
        this.menuList = menuList;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }


    @Override
    public String toString() {
        int lineNumber = 0;
        for (Order order : this.orderList) {
            lineNumber++;
        }
        return ( lineNumber + ". " + dish.getTitle() + " " + dish.getQuantity() + "x    " + "(" + (dish.getQuantity()* dish.getPrice()) + " Kč) " +
                order.getOrderedTime() + "-" + order.getFulfilmentTime() + " číšník č. " +  order.getWaiterNo() + " " + "\n");
    }
  }



