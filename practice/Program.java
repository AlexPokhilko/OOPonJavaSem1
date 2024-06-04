package practice;

// package ООПНаСеминаре2.practice;

// package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import practice.Product;
import practice.VendingMachine;

public class Program {
    public static void main(String[] args) {
        
        Product tea = new HotDrink("Tea", 100, 150, 90);
        Product americano = new HotDrink("Americano", 200, 150, 85);
        Product cacao = new HotDrink("Cacao", 150, 100, 80);

        List<Product> list1 = new ArrayList<Product>();
        list1 = List.of(tea, americano, americano, cacao, cacao);
        VendingMachine hdvm1 = new HotDrinkVendingMachine(list1);

        List<Product> list2 = new ArrayList<Product>();
        list2 = List.of(tea, tea, tea, americano, americano, cacao, cacao, cacao);
        VendingMachine hdvm2 = new HotDrinkVendingMachine(list2);

        List<Product> list3 = new ArrayList<Product>();
        list3 = List.of(tea, americano, americano, americano, americano, cacao, cacao);
        VendingMachine hdvm3 = new HotDrinkVendingMachine(list3);

        System.out.println(hdvm1.getProduct("Cacao"));
        System.out.println(hdvm1.getProduct("Tea"));
        System.out.println(hdvm1.getProduct("Americano"));


    }
}
