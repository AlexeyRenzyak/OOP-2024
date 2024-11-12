package practice6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Restaurant universalPizzeria = new Restaurant(new Pizza(35), 10, Type.UNIVERSAL);
       Restaurant catRestaurant = new Restaurant(new CatFood(), 0, Type.ANIMAL);
       Restaurant humanIceCream = new Restaurant(new IceCream(Taste.VANILLA), 4, Type.HUMAN);
       Restaurant wrongCafe1 = new Restaurant(new IceCream(Taste.BUBBLEGUM), 4, Type.ANIMAL);
       Restaurant wrongCafe2 = new Restaurant(new CatFood(), 1, Type.HUMAN);

       Person p1 = new Person("Test 1", 30, 10);
       Cat c1 = new Cat("TestCat 1", "Black");

       p1.work(2);
       System.out.println("Person Money: " + p1.getMoney());
       universalPizzeria.service(p1);
       System.out.println("Person Money: " + p1.getMoney());
       System.out.println("Person Energy: " + p1.getNutrients());
       p1.work(2);
       System.out.println("Person Money: " + p1.getMoney());
       System.out.println("Person Energy: " + p1.getNutrients());
       universalPizzeria.service(p1);
       humanIceCream.service(p1);
       catRestaurant.service(p1);
       wrongCafe2.service(p1);
       System.out.println("Person Money: " + p1.getMoney());
       System.out.println("Person Energy: " + p1.getNutrients());

       universalPizzeria.service(c1);
       catRestaurant.service(c1);
       humanIceCream.service(c1);
       wrongCafe1.service(c1);
       wrongCafe2.service(c1);
       c1.play();
       System.out.println("Cat Energy: " + c1.getNutrients());
    }
}
