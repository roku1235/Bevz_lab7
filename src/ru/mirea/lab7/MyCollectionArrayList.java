package ru.mirea.lab7;
import java.util.ArrayList;

public class MyCollectionArrayList {

    public static void main(String[] args) {

        ArrayList<String> zoo = new ArrayList<String>();
        zoo.add("Черепаха");
        zoo.add("Жираф");
        zoo.add("Слон");
        zoo.add("Крокодил");

        System.out.printf("В зоопарке %d животных. \n", zoo.size());
        for(String animals : zoo){
            System.out.println(animals);
        }

        zoo.add(0, "Панда");
        zoo.add(5, "Павлин");

        System.out.printf("В зоопарк привезли новых животных. Теперь их %d. \n", zoo.size());
        for(String animals : zoo){
            System.out.println(animals);
        }

        zoo.add(6, "Медведь");

        if(zoo.contains("Медведь")){
            System.out.println("Также в зоопарке есть медведь. \n");
        }

        System.out.println(zoo.get(6));
        zoo.set(6, "Белый медведь");
        System.out.println("Этот медведь ‐ белый. \n");

        zoo.remove(4);

        Object[] beasts = zoo.toArray();
        for(Object beast : beasts){
            System.out.println(beast);
        }

    }

}
