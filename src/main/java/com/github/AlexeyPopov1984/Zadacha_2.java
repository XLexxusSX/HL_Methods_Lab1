package com.github.AlexeyPopov1984;

public class Zadacha_2 {
    public static void zadacha_2() {
        String sourceText = "make install";
        System.out.println("\nRESHENIE ZADACHI 2:");
        System.out.print("Ishodniy tekst: \"" + sourceText + "\".\nOtzerkalenniy tekst: \"" + textMirror(sourceText) + "\".\n");
    }

    private static String textMirror(String anyStr) {

        StringBuilder sbAnyStr = new StringBuilder(anyStr);
        char ch;
        String mirroredText;

            for (int i = 0; i < anyStr.length() / 2; i++) {
                ch = anyStr.charAt(i);
                sbAnyStr.setCharAt(i, anyStr.charAt(anyStr.length() - 1 - i));
                sbAnyStr.setCharAt(anyStr.length() - 1 - i, ch);
        }

        mirroredText = sbAnyStr.toString();

        return mirroredText;
    }
}