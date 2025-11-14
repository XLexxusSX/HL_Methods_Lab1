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
        System.out.println("Koeffitsient C: ?\n");

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

        System.out.println("Koeffitsient C: ?\n");

        while (true) {
            System.out.print("Vvedite koeffitsient C: ");
            koefCstring = scanner.nextLine();

            try {
                koefCdouble = Double.parseDouble(koefCstring);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Neverniy vvod, poprobuyte snova. ");
            }
        }

        if (koefAdouble % 1 == 0) {
            System.out.println("Koeffitsient A: " + (int) koefAdouble);
            koefAstring = "" + (int) koefAdouble;
        } else {
            System.out.println("Koeffitsient A: " + koefAdouble);
            koefAstring = "" + koefAdouble;
        }

        if (koefBdouble % 1 == 0) {
            System.out.println("Koeffitsient B: " + (int) koefBdouble);
            if (koefBdouble > 0)
                koefBstring = " + " + (int) koefBdouble;
            else koefBstring = " - " + (int) koefBdouble * (-1);
        } else {
            System.out.println("Koeffitsient B: " + koefBdouble);
            if (koefBdouble > 0)
                koefBstring = " + " + koefBdouble;
            else if (koefBdouble < 0)
                koefBstring = " - " + koefBdouble * (-1);
            else koefBstring = "";
        }

        if (koefBdouble % 1 == 0) {
            System.out.println("Koeffitsient C: " + (int) koefCdouble);
            if (koefBdouble > 0)
                koefCstring = "+" + (int) koefCdouble;
            else koefCstring = "" + (int) koefCdouble;
        } else {
            System.out.println("Koeffitsient C: " + koefCdouble);
            if (koefCdouble > 0)
                koefCstring = "+" + koefCdouble;
            else if ((koefCdouble < 0))
                koefCstring = "" + koefCdouble;
            else koefCstring = "";
        }

        System.out.println("Vashe kvadratnoe uravnenie " + koefAstring + "x^2" + koefBstring + "x"  + koefCstring + " = 0");

        //roots();
    }

    public static String roots() {
        String answer = "";

        return answer;
    }
}
