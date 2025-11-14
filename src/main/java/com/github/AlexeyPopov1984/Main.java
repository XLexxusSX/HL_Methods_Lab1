package com.github.AlexeyPopov1984;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ConsoleMenu();
    }

    public static void ConsoleMenu() {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nZadachi: ");
            System.out.println("1. Programma, v kotoroy perebirayutsya chisla ot 1 do 500...");
            System.out.println("2. Zavedite peremennuyu tipa String so znacheniem <<make install>>...");
            System.out.println("3. Esli kvadratnoe uravnenie imeet veschestvennye korni...");
            System.out.println("4. Vychislit' summu ryada...");
            System.out.println("5. Proverit' yavlyaetsya li stroka polindromom...\n");
            System.out.print("Vvedite nomer zadachi (ot 1 do 5) ili 'q' dlya vyhoda: ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q"))
                break;
            else if (input.equalsIgnoreCase("1"))
                Zadacha_1.zadacha_1();
            else if (input.equalsIgnoreCase("2"))
                Zadacha_2.zadacha_2();
            else if (input.equalsIgnoreCase("3"))
                Zadacha_3.zadacha_3();
            else if (input.equalsIgnoreCase("4"))
                System.out.println("\nReshenie zadachi 4:");
            else if (input.equalsIgnoreCase("5"))
                System.out.println("\nReshenie zadachi 5:");
            else
                System.out.println("\nNeverniy vvod. Poprobuyte snova");
        } while (true);
    }
}