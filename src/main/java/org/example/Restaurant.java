package org.example;

import com.engeto.restaurant.*;

import java.time.LocalTime;
import java.util.*;


public class Restaurant {


    public static void main(String[] args) {

        DishList dishList = new DishList();
        Restaurant restaurant = new Restaurant();
        RestaurantManager restaurantManager= new RestaurantManager();

        ImageUrl imageBlank = new ImageUrl("blank");
        ImageUrl imageRizek1 = new ImageUrl("rizek-01");
        ImageUrl imageRizek2 = new ImageUrl("rizek-02");
        ImageUrl imagePstruh1 = new ImageUrl("pstruh-01");
        ImageUrl imageCesnecka1 = new ImageUrl("cesnecka-01");
        ImageUrl imageBirell1 = new ImageUrl("birell-01");
        ImageUrl imageKofola1 = new ImageUrl("kofola-01");

        Dish dish1 = new Dish("Kuřecí řízek obalovaný", 120, 2,8, imageRizek1, imageRizek2, Category.FOOD, " 150g");
        Dish dish2 = new Dish("Pstruh na víně", 135, 1,8, imagePstruh1, imageBlank, Category.FOOD, " 200g");
        Dish dish3 = new Dish("Hranolky", 35, 2, 10, imageBlank, Category.FOOD, "150g");
        Dish dish4 = new Dish("Bramborový salát", 35, 1, 4, imageBlank, Category.FOOD," 150g");
        Dish dish5 = new Dish("Bramboračka", 45, 1, 3, imageBlank, Category.SOUP, " 0,3l");
        Dish dish6 = new Dish("Česnečka", 44, 1, 3, imageCesnecka1, Category.SOUP, " 0,3l");
        Dish dish7 = new Dish("Birell", 42, 1, 3, imageBirell1, Category.DRINK," 0,5l");
        Dish dish8 = new Dish("Kofola", 33, 2, 3, imageKofola1, Category.DRINK, " 0,3l");

        dishList.addAll(Arrays.asList(dish1, dish2, dish3, dish4, dish5, dish6, dish7, dish8));
        List<Dish> menuList = new ArrayList<>();
        menuList.add(dish1);
        menuList.add(dish3);
        menuList.add(dish6);
        menuList.add(dish8);

        Order order1 = new Order(15, dish1, LocalTime.of(12, 10), LocalTime.of(12, 16), 2, true);
        Order order2 = new Order(15, dish3, LocalTime.of(12, 11), LocalTime.of(12, 16), 2, true);
        Order order3 = new Order(1, dish6, LocalTime.of(12, 12), LocalTime.of(12, 14), 1, true);
        Order order4 = new Order(1, dish8, LocalTime.of(12, 15), LocalTime.of(12, 18), 1, true);

        order1.getMenuList().add(dish1);
        order2.getMenuList().add(dish3);
        order3.getMenuList().add(dish6);
        order4.getMenuList().add(dish8);

        order1.addDishWhatIsInMenuWithQuantity(dish2, 2, menuList);

        restaurantManager.getOrderList().add(order1);
        restaurantManager.getOrderList().add(order2);
        restaurantManager.getOrderList().add(order3);
        restaurantManager.getOrderList().add(order4);
        Collections.sort(restaurantManager.getOrderList(), new SortComparator());
        restaurantManager.getOrderList().forEach( n -> { System.out.println("Číšnik " + n.getWaiterNo() +  ".  objednávka č." + n.getId() + "  čas objednání: " + n.getOrderedTime() );
        } );

        System.out.println(order1);
        System.out.println(order2 + "\n");

        System.out.println("Počet jídel v menu : " + dishList.size());
        System.out.println("Aktuálně jsou v menu jídla: \n" + menuList + "\n");

        System.out.println("Objednávka: " + order1);
        System.out.println("Objednávka: " + order2);
        System.out.println("Objednávka: " + order3);
        System.out.println("Objednávka: " + order4 + "\n");

        System.out.println("Počet objednávek: " + restaurantManager.getOrderList().size());
        System.out.println("Dnešní objednávky: \n" + restaurantManager.getOrderList());

        System.out.println(restaurantManager.orderInProgress(restaurantManager.getOrderList()));
        System.out.println("Cena objednávek pro číšnika 1: " + restaurantManager.waiterOrderPrice(1) + " Kč"+ "\n");
        System.out.println("Celková útrata: " + restaurantManager.totalSpend() + " Kč" + "\n");

        System.out.println("** Objednávka pro stůl č. 1 **" + "\n"
                + "****" + "\n"
                + restaurantManager.orderTable(1) + "\n"
                + "******"+ "\n"
        );


        System.out.println(dish1);
        System.out.println(dish2);
        System.out.println("\n");

        System.out.println("Celkový počet jídel: " + dishList.size());
        System.out.println(dishList.getDishFromDishList());

        dishList.remove(dish7);
        System.out.println("Jídla v menu po odebrání Birellu: " + "\n" + dishList.getDishFromDishList());
        System.out.println("Nachází se Birell v menu ? : " + dishList.contains(dish7));
        dishList.clear();
        System.out.println("Počet jídel v menu : " + dishList.size());
        System.out.println(dish1.getDishInfo());

        try {
        restaurantManager.saveToFile(Settings.getFilename(), Settings.getDelimeter());
        } catch (DishException e) {
            System.err.println(e.getLocalizedMessage());
        }

    }
 }