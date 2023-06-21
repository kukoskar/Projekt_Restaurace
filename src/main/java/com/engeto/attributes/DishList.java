package com.engeto.attributes;

import java.util.ArrayList;
import java.util.List;


public class DishList extends ArrayList<Dish> implements Assignable {

    private Dish dish;
    public List<Dish> dishList = new ArrayList<>();
    public List<Dish> menuList = new ArrayList<>();

    public DishList(Dish dish, List<Dish> dishList, List<Dish> menuList) {
        this.dish = dish;
        this.dishList = dishList;
        this.menuList = menuList;
    }

    public DishList() {
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(List<Dish> menuList) throws DishException {
        if(!menuList.contains(dish)) {
            throw new DishException("Jídlo není v aktuálním menu ");
        }
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }

    public List<Dish> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Dish> menuList) {
        this.menuList = menuList;
    }




    public String getDishFromDishList() {
        String allMenu = "";
        int lineNumber = 0;
        for (Dish dish : this) {
            lineNumber++;
          allMenu += lineNumber + ". " + dish.getDishInfo() + "\n";
        }
      return allMenu;
    }


    public String getPriceFromDishList() {
        String priceMenu = "";
        int lineNumber = 0;
        for (Dish dish : this) {
            lineNumber++;
            priceMenu += lineNumber + ". " + dish.getPrice() + " Kč" + "\n";
        }
        return priceMenu;
    }

    public String getDishFromMenuList() {
        String dishMenu = "";
        int lineNumber = 0;
        for (Dish dish : menuList) {
            lineNumber++;
            dishMenu += lineNumber + ". " + dish.getTitle() + " " + dish.getPrice() +" Kč" + "\n";
        }
        return dishMenu;
    }


    @Override
    public String getOrderInfo() {
        return dish.getTitle() + " (" + dish.getPrice() + " Kč)" +" doba přípravy " + dish.getPreparationTime() + " min ";
    }

    @Override
    public String toString() {
        return  "Jídlo: " + getDish() + " " + "x";
    }


}
