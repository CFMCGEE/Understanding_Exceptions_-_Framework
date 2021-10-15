package testautomation.looping;

import java.util.*;

public class Map_Set {

    public static void main(String[] args) {

        Set<String> setOfFruit = new HashSet();
        Map<String, Integer> mapOfFruitCalories = new HashMap();


        setOfFruit.add("Apple");
        setOfFruit.add("Lemon");
        setOfFruit.add("Banana");
        setOfFruit.add("Orange");
        setOfFruit.add("Lemon");

        mapOfFruitCalories.put("Apple", 95);
        mapOfFruitCalories.put("Lemon", 20);
        mapOfFruitCalories.put("Banana", 105);
        mapOfFruitCalories.put("Orange", 45);
        mapOfFruitCalories.put("Lemon", 17);

        var i = setOfFruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (String item : setOfFruit) {
            System.out.println(item);
        }

        //setOfFruit.forEach(x -> System.out.println(x));
        setOfFruit.forEach(System.out::println);

        for (var entry : mapOfFruitCalories.entrySet()) {
            System.out.println(entry.getValue());
        }

        mapOfFruitCalories.forEach(
                (k, v) -> System.out.println("Fruit: " + k + ", Calories: " + v)
        );

    }

}
