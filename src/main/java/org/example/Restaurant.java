package org.example;

import com.engeto.attributes.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static com.engeto.attributes.DishList.dishList;


public class Main {

    List<Dish> dishList = new ArrayList<>();
    public static List<Dish> dishList = new ArrayList<>();

    public static void main(String[] args) {



        Waiter waiter1 = new Waiter(1, "František Svoboda");
        Waiter waiter2 = new Waiter(2, "Karel Černý");

        Dish dish1 = new Dish("Kuřecí řízek obalovaný", 120, 8, "rizek-01", "rizek-02", Category.FOOD, " 150g");
        Dish dish2 = new Dish("Pstruh na víně", 135, 8, "pstruh-01", Category.FOOD, " 200g");
        Dish dish3 = new Dish("Hranolky", 35, 10,  Category.FOOD, "150g");
        Dish dish4 = new Dish("Bramborový salát", 35, 4, Category.FOOD," 150g");
        Dish dish5 = new Dish("Bramboračka", 45, 3, Category.SOUP, " 0,3l");
        Dish dish6 = new Dish("Česnečka", 44, 3, Category.SOUP, " 0,3l");
        Dish dish7 = new Dish("Birell", 42, 3, Category.DRINK," 0,5l");
        Dish dish8 = new Dish("Kofola", 33, 3, Category.DRINK, " 0,3l");

        dishList.add(dish1);
        dishList.add(dish2);
        dishList.add(dish3);
        dishList.add(dish4);
        dishList.add(dish5);
        dishList.add(dish6);
        dishList.add(dish7);
        dishList.add(dish8);

        dishMenu.add(dish1);
        dishMenu.add(dish3);
        dishMenu.add(dish4);
        dishMenu.add(dish6);
        dishMenu.add(dish8);

        Order order1 = new Order(table1, waiter1, LocalTime.of(12,24), LocalTime.of(13,05), true);
            order1.setQuantity(2);
        Order order2 = new Order(table1, waiter1, LocalTime.of(12,24), LocalTime.of(13,05), true);
            order2.setQuantity(2);
        Order order3 = new Order(table1, waiter2, LocalTime.of(12,20), LocalTime.of(13,05), true);

        dishMenu.add(order1);
        dishMenu.add(order2);
        dishMenu.add(order1);
        dishMenu.add(order1);
        dishMenu.add(order3);


        System.out.println("Počet jídel v menu: " + dishMenu.size());
        System.out.println(DishMenu.getDishFromDishMenu());

        System.out.println(table1.getTableInfo());
        //+ order1.getOrderInfo() + order2.getOrderInfo() + order3.getOrderInfo());

        System.out.println("Celkový počet jídel: " + dishList.size());
        System.out.println(DishList.getDishFromDishList());
        System.out.println(DishList.getPriceFromDishList());

        System.out.println(table1.getTableInfo() + dish1.getId() + ". " + dish1.getTitle() + " (" + dish1.getPrice() + " Kč):   " + order1.getOrderedTime() + "-" +
          order1.getFulfilmentTime() + " číšník č. " + waiter1.getWaiter() + "\n"
           + dish3.getId() + ". " + dish3.getTitle() +  " (" + dish3.getPrice() + " Kč):   " + order2.getOrderedTime() + "-" +
                        order2.getFulfilmentTime() + " číšník č. " + waiter2.getWaiter() + "\n"
          + dish7.getId() + ". " + dish7.getTitle() +  " (" + dish7.getPrice() + " Kč):   " + order3.getOrderedTime() + "-" +
                order3.getFulfilmentTime() + " číšník č. " + waiter1.getWaiter() + "\n"
          + "******" );




         /* ** Objednávky pro stůl č.  4 **
        ****
        1. Kofola velká 4x (130 Kč):    15:25-15:29 číšník č. 3
        2. Pizza Grande (130 Kč):   15:29-16:10 číšník č. 4
        3. Nanuk Míša (30 Kč):  17:12-17:18 číšník č. 2
        *******/


        dishList.remove(dish7);
        System.out.println("Jídla v menu po odebrání Birellu: " + "\n" + DishList.getDishFromDishList());
        System.out.println("Nachází se Birell v menu ? : " + dishList.contains(dish7));
        dishList.clear();
        System.out.println("Počet jídel v menu : " + dishList.size());
        System.out.println(waiter1.getDescription());
        System.out.println(waiter2.getDescription());


        System.out.println(dish1.getDish());





    }
 }