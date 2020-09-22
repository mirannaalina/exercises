package Genericss;

import java.util.ArrayList;
import java.util.List;

import static Genericss.Constants.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(test);

        FactoryPizza faccct = new FactoryPizza();


        List<Pizza> plist = new ArrayList<>();
        plist.add(faccct.getPizza("cheezepizza"));
        plist.add(faccct.getPizza("hampizza"));
        plist.add(faccct.getPizza("hampizza"));
        plist.add(faccct.getPizza("pizza"));

        System.out.println("====================");

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");


        for(String st: stringList){
            System.out.println(stringList);
        }
        System.out.println("inceput de test stream-------");
        stringList
                .stream()
                .forEach(System.out::println);

        System.out.println("test-test");
        System.out.println("=========================");
        System.out.println("Size of list is " +plist.size());

        System.out.println("=====================");
        listPizza(plist);

        System.out.println("===================");
        //System.out.println(streamlistPizza(plist));

        System.out.println(streamlistPizza(stringList,3));

    }

    public static void listPizza(List<Pizza>pizzaList){
        for(Pizza item: pizzaList)
            System.out.println(item.getName());
    }

    public static void streamlistPizza(List<Pizza>  mylist){
        mylist
                .stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static List<String> streamlistPizza(List<String> mylist,int nr){
       mylist
                .stream()
                .sorted()
                .forEach(System.out::println);
       return mylist;
    }
}
