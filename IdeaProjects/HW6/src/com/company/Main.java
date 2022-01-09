package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1");

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                list.remove(i);
                i--;

            }

        }
        System.out.println("ArrayList" + list);

        System.out.println("Task 2");

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Kiwi");
        fruits.add("Lemon");
        fruits.add("Orange");
        int a = 0;
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i) == "Orange") {
                fruits.set(i, "Graperfuit");
                a++;
            }

        }
        if (a == 0) {
            System.err.println("Orange is not on the list ");
        }
        System.out.println("Fruits" + fruits);

        System.out.println("Task 3");

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(5);
        numbers1.add(36);
        numbers1.add(77);
        numbers1.add(11);
        numbers1.add(3);
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(88);
        numbers2.add(36);
        numbers2.add(5);
        numbers2.add(99);
        numbers2.add(11);
        for (int i = 0; i < numbers1.size(); i++) {
            for (int m = 0; m < numbers2.size(); m++) {
                if (numbers1.get(i) == numbers2.get(m)) {
                    System.out.println(numbers1.get(i));
                }
            }
        }

    }

}


