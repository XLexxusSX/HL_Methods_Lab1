package com.github.AlexeyPopov1984;

public class Zadacha_2 {
    public static void zadacha_2() {
        System.out.println("\nReshenie zadachi 2:");
        System.out.println(textMirror("make install"));
    }

    public static String textMirror(String anyStr) {

        StringBuilder sb = new StringBuilder(anyStr);
        char ch = ' ';

        if (anyStr.length() % 2 == 0)
            for (int i = 0; i < anyStr.length() / 2; i++) {
                ch = anyStr.charAt(i);
                sb.setCharAt(anyStr.length() - 1 - i, ch);                ;
            }
        String mirroredText = sb.toString();

        return mirroredText;
    }
}