package testautomation;

import java.util.*;

public class Framework {

    public static void main(String[] args) {

        Set setOfFruit = new HashSet();
        List listOfFruit = new ArrayList();
        Queue queueOfFruit = new LinkedList();
        Map mapOfFruitCalories = new HashMap();

        setOfFruit.add("Apple");
        setOfFruit.add("Lemon");
        setOfFruit.add("Banana");
        setOfFruit.add("Orange");
        setOfFruit.add("Lemon");

        //Set only holds values
        System.out.println(setOfFruit.size()); //expected output: 4 <--- Sets take no duplicates as a value
        System.out.println(setOfFruit); //expected output: [Apple, Lemon, Orange, Banana] <--- Sets are always unordered by default

        listOfFruit.add("Apple");
        listOfFruit.add("Lemon");
        listOfFruit.add("Banana");
        listOfFruit.add("Orange");
        listOfFruit.add("Lemon");

        //List holds both indexes and elements
        System.out.println(listOfFruit.get(2)); //expected output: Banana
        System.out.println(listOfFruit.size()); //expected output: 5 <--- Lists allow duplicates as a value
        System.out.println(listOfFruit); //expected output: [Apple, Lemon, Banana, Orange, Lemon] <--- Lists are always ordered by default
        //       (this is why when you get the third element you get Banana) ^

        queueOfFruit.add("Apple");
        queueOfFruit.add("Lemon");
        queueOfFruit.add("Banana");
        queueOfFruit.add("Orange");
        queueOfFruit.add("Lemon");

        //Queue holds both indexes and elements
        System.out.println(queueOfFruit.size()); //expected output: 5 <--- Queues allow duplicates as a value
        System.out.println(queueOfFruit); //expected output: [Apple, Lemon, Banana, Orange, Lemon] <--- Queues output what was added first into it

        queueOfFruit.remove();
        System.out.println(queueOfFruit); //expected output: [Lemon, Banana, Orange, Lemon] <--- Remove methods takes the first element out of the Queue

        System.out.println(queueOfFruit.peek());  //expected output: Lemon <--- Returns the first element (head) of the Queue

        //Map holds both a key and value pair
        mapOfFruitCalories.put("Apple", 95);
        mapOfFruitCalories.put("Lemon", 20);
        mapOfFruitCalories.put("Banana", 105);
        mapOfFruitCalories.put("Orange", 45);
        mapOfFruitCalories.put("Lemon", 17);

        System.out.println(mapOfFruitCalories.size()); //expected output: 4 <--- Map take no duplicates as a value
        System.out.println(mapOfFruitCalories); //expected output: {Apple=95, Lemon=17, Orange=45, Banana=105} <--- Map have no order is guaranteed

        System.out.println(mapOfFruitCalories.get("Lemon"));//expected output: 17 <--- Gets the key and provides the value

        System.out.println(mapOfFruitCalories.entrySet()); //expected output: [Apple=95, Lemon=17, Orange=45, Banana=105] <--- Returns a Set of the key/value Entries used for iterating

        mapOfFruitCalories.remove("Orange");
        System.out.println(mapOfFruitCalories); //expected output: {Apple=95, Lemon=17, Banana=105} <--- Removes the value of the given key


        List unchangeableList = List.of("Apple", "Lemon", "Banana");
        unchangeableList.add("Orange"); //expected output: UnsupportedOperationException <--- Using the Of method makes the List unchangeable
        unchangeableList.remove(1); //expected output: UnsupportedOperationException <--- Using the Of method makes the List unchangeable








    }

}
