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



    public void saveToFile(String filename, String delimeter) throws DishException {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)))) {
            for (Order order : orderList) {
                String record =
                         order.getId()+delimeter
                           +order.getDish()+delimeter
                           +dish.getQuantity()+"x"+delimeter
                           +"(" + (dish.getPrice()* dish.getQuantity() +" Kč)")+":"+delimeter
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
}
