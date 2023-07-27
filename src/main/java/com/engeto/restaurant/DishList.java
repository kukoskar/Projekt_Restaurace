package com.engeto.restaurant;

import java.util.ArrayList;
import java.util.List;


public class DishList extends ArrayList<Dish> {

    private List<Dish> dishList = new ArrayList<>();
    private List<Dish> menuList = new ArrayList<>();

    public DishList(List<Dish> dishList, List<Dish> menuList) {
        this.dishList = dishList;
        this.menuList = menuList;
    }

    public DishList() {
        dishList = new ArrayList<>();
        menuList = new ArrayList<>();
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




    @Override
    public String toString() {
        return  "Jídla v menu: " +  getMenuList() + "\n";
    }


}
