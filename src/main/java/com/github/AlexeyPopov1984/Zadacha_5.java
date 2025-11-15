package com.github.AlexeyPopov1984;

import java.util.Scanner;

public class Zadacha_5 {
    public static void dataEntryTask_5() {

        System.out.println("\nRESHENIE ZADACHI 5:");
        System.out.print("1) v dannom otvete strochnye i propisnye bukvy schitayutsya odinakovymi;\n2) probely ne schitayutsya simvolom.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nVvedite stroku: ");
        String strToCheck = scanner.nextLine();
        System.out.println("\n" + checkPaliStr(strToCheck));
    }

    private static String checkPaliStr(String _strToCheck) {

        String answer = "";
        String lowerCaseStrWithoutSpaces = _strToCheck.replace(" ", "").toLowerCase();
        Boolean palindrom = true;

        for (int i = 0; i < lowerCaseStrWithoutSpaces.length() / 2; i++) {
            if (lowerCaseStrWithoutSpaces.charAt(i) != lowerCaseStrWithoutSpaces.charAt(lowerCaseStrWithoutSpaces.length() - 1 - i)) {
                answer = "Bez probelov i v nizhnem registre: " + lowerCaseStrWithoutSpaces + "\nVvedennaya stroka - NE palindrom!";
                palindrom = false;
                break;
            }

            if (palindrom) {
                answer = "Bez probelov i v nizhnem registre: " + lowerCaseStrWithoutSpaces + "\nVvedennaya stroka - PALINDROM!";
            }
        }

        if (lowerCaseStrWithoutSpaces.length() == 1) {
            answer = "Stroka sostoit iz odnogo simvola!";
        }

        return answer;
    }
}
