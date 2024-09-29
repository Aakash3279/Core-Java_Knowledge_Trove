package dev.lpa;

import com.abc.first.Item;
import com.abc.first.*;

public class Main {
    public static void main(String[] args) {
        //method 1
        com.abc.first.Item firstItem = new com.abc.first.Item("burger");
        System.out.println(firstItem);

        //method 2
        Item secondItem = new Item("Pizza");
        System.out.println(secondItem);

    }
}
