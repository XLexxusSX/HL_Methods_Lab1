package com.github.AlexeyPopov1984;

import java.util.ArrayList;
import java.util.List;

public class Zadacha_1 {
    public static void dataEntryTask_1() {
        System.out.println("\nRESHENIE ZADACHI 1:");
        String str = String.join(" ", sequence(500));
        System.out.println("Preobrazovannaya stroka: " + str);
    }

    private static List<String> sequence(int n) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                if (i % 7 == 0)
                    list.add("fizzbuzz");
                else
                    list.add("fizz");
            } else if (i % 7 == 0) {
                list.add("buzz");
            } else
                list.add(String.valueOf(i));
        }

        return list;
    }
}