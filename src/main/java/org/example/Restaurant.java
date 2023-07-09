package org.example;

import com.engeto.attributes.*;

import java.time.LocalTime;
import java.util.*;


public class Restaurant {
    static List<Order> orderList = new ArrayList<>();

    public static void main(String[] args) throws DishException {

        DishList dishList = new DishList();
        List<Image> imageList = new ArrayList<>();

        Image imageBlank = new Image("blank");
        Image imageRizek1 = new Image("rizek-01");
        Image imageRizek2 = new Image("rizek-02");
        Image imagePstruh1 = new Image("pstruh-01");
        Image imageCesnecka1 = new Image("cesnecka-01");
        Image imageBirell1 = new Image("birell-01");
        Image imageKofola1 = new Image("kofola-01");
        imageList.addAll(Arrays.asList(imageBlank, imageRizek1, imageRizek2, imagePstruh1, imageCesnecka1, imageBirell1, imageKofola1));
        System.out.println(imageList);
        Image imageKofola2 = new Image("kofola-02");
        imageList.add(imageKofola2);
        System.out.println(imageList);
        imageList.remove(imageKofola2);
        System.out.println(imageList+"\n");

        Dish dish1 = new Dish("Kuřecí řízek obalovaný", 120, 8, imageRizek1, imageRizek2, Category.FOOD, " 150g");
        Dish dish2 = new Dish("Pstruh na víně", 135,8, imagePstruh1, imageBlank, Category.FOOD, " 200g");
        Dish dish3 = new Dish("Hranolky", 35, 10, imageBlank, Category.FOOD, "150g");
        Dish dish4 = new Dish("Bramborový salát", 35, 4, imageBlank, Category.FOOD," 150g");
        Dish dish5 = new Dish("Bramboračka", 45, 3, imageBlank, Category.SOUP, " 0,3l");
        Dish dish6 = new Dish("Česnečka", 44, 3, imageCesnecka1, Category.SOUP, " 0,3l");
        Dish dish7 = new Dish("Birell", 42, 3, imageBirell1, Category.DRINK," 0,5l");
        Dish dish8 = new Dish("Kofola", 33, 3, imageKofola1, Category.DRINK, " 0,3l");

        dishList.addAll(Arrays.asList(dish1, dish2, dish3, dish4, dish5, dish6, dish7, dish8));
        List<Dish> menuList = new ArrayList<>();
        menuList.add(dish1);
        menuList.add(dish3);
        menuList.add(dish6);
        menuList.add(dish8);

        Order order1 = new Order(15, dish1, 2, LocalTime.of(12, 10), LocalTime.of(12, 16), 1, true, "popis");
        Order order2 = new Order(15, dish2, 3, LocalTime.of(12, 10), LocalTime.of(12, 16), 1, true, "popis");
        Order order3 = new Order(1, dish3, 1, LocalTime.of(12, 12), LocalTime.of(12, 14), 2, true, "popis");
        Order order4 = new Order(1, dish6, 2, LocalTime.of(12, 15), LocalTime.of(12, 18), 2, true, "popis");

        order1.menuList.add(dish1);
        order1.menuList.add(dish2);
        order1.menuList.add(dish3);
        order1.menuList.add(dish6);

        order1.addDishWhatIsInMenuWithQuantity(dish1, 2, menuList);
        order1.addDishWhatIsInMenuWithQuantity(dish2, 2, menuList);
        System.out.println(order1);
        System.out.println(order2 + "\n");

        System.out.println("Aktuálně jsou v menu jídla: \n" + menuList);
        System.out.println("Je objednávka rozpracovaná ? " + "\n" + order1.isOrderInProgress());
        System.out.println("\n");
        System.out.println("Objednávka: " + order1 + "\n");

        System.out.println(" "+order1);
        System.out.println(" "+order2);
        System.out.println(" "+order4);
        System.out.println("\n");

        System.out.println(dish1);
        System.out.println(dish2);
        System.out.println("\n");

        System.out.println("Celkový počet jídel: " + dishList.size());
        System.out.println(dishList.getDishFromDishList());
        System.out.println("Počet jídel v menu: " + menuList.size());
        System.out.println(dishList.getDishFromMenuList());

        System.out.println("Ceny všech jídel: " + "\n" + dishList.getPriceFromDishList());

        dishList.remove(dish7);
        System.out.println("Jídla v menu po odebrání Birellu: " + "\n" + dishList.getDishFromDishList());
        System.out.println("Nachází se Birell v menu ? : " + dishList.contains(dish7));
        dishList.clear();
        System.out.println("Počet jídel v menu : " + dishList.size());
        System.out.println(dish1.getDishInfo());



    }
 }