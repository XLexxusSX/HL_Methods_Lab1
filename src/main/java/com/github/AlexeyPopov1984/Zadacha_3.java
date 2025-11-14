package com.github.AlexeyPopov1984;

import java.util.Scanner;

public class Zadacha_3 {
    public static void zadacha_3() {
        Scanner scanner = new Scanner(System.in);
        String koefAstring = "", koefBstring = "", koefCstring = "";
        double koefAdouble = 0, koefBdouble = 0, koefCdouble = 0;

        System.out.println("\nRESHENIE ZADACHI 3");
        System.out.println("Koeffitsient A: ?");
        System.out.println("Koeffitsient B: ?");
        System.out.println("Koeffitsient C: ?\n");

        while (true) {
            System.out.print("Vvedite koeffitsient A: ");
            koefAstring = scanner.nextLine();

            try {
                koefAdouble = Double.parseDouble(koefAstring);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Neverniy vvod, poprobuyte snova. ");
            }
        }

        if (koefAdouble % 1 == 0)
            System.out.println("Koeffitsient A: " + (int) koefAdouble);
        else System.out.println("Koeffitsient A: " + koefAdouble);

        System.out.println("Koeffitsient B: ?");
        System.out.println("Koeffitsient C: ?");

        while (true) {
            System.out.print("Vvedite koeffitsient B: ");
            koefBstring = scanner.nextLine();

            try {
                koefBdouble = Double.parseDouble(koefBstring);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Neverniy vvod, poprobuyte snova. ");
            }
        }

        if (koefAdouble % 1 == 0)
            System.out.println("Koeffitsient A: " + (int) koefAdouble);
        else System.out.println("Koeffitsient A: " + koefAdouble);

        if (koefBdouble % 1 == 0)
            System.out.println("Koeffitsient B: " + (int) koefBdouble);
        else System.out.println("Koeffitsient B: " + koefBdouble);

        System.out.println("Koeffitsient C: ?");

        //roots();
    }

    public static String roots() {
        String answer = "";

        return answer;
    }
}
