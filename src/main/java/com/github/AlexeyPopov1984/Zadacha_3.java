package com.github.AlexeyPopov1984;

import java.util.Scanner;

public class Zadacha_3 {
    public static void zadacha_3() {
        Scanner scanner = new Scanner(System.in);
        String koefAstring = "", koefBstring = "", koefCstring = "", answer = "";
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
            else koefBstring = " - " + koefBdouble * (-1);
        }

        if (koefCdouble % 1 == 0) {
            System.out.println("Koeffitsient C: " + (int) koefCdouble);
            if (koefCdouble > 0)
                koefCstring = " + " + (int) koefCdouble;
            else koefCstring = " - " + (int) koefCdouble * (-1);
        } else {
            System.out.println("Koeffitsient C: " + koefCdouble);
            if (koefCdouble > 0)
                koefCstring = " + " + koefCdouble;
            else koefCstring = " - " + koefCdouble * (-1);
        }

        answer = roots(koefAdouble, koefBdouble, koefCdouble, koefAstring, koefBstring, koefCstring);
        System.out.println(answer);
    }

    private static String roots(double _koefAdouble, double _koefBdouble, double _koefCdouble, String _koefAstring, String _koefBstring, String _koefCstring) {
        String _answer = "";
        double D = 0, x1 = 0, x2 = 0;

        // Если А == 0, B != 0, C != 0 (проверено)
        if (_koefAdouble == 0 && _koefBdouble != 0 && _koefCdouble != 0) {
            if (_koefBdouble > 0) {
                _koefBstring = _koefBstring.replace(" ", "");
                _koefBstring = _koefBstring.substring(1);
                _answer = "\nVashe uravnenie " + _koefBstring + "x" + _koefCstring + " = 0 ne yavlyaetsya kvadratnym";
            } else if (_koefBdouble < 0) {
                _koefBstring = _koefBstring.replace(" ", "");
                _answer = "\nVashe uravnenie " + _koefBstring + "x" + _koefCstring + " = 0 ne yavlyaetsya kvadratnym";
            }
        }

        // Если А != 0, B == 0, C != 0 (преверено)
        else if (_koefAdouble != 0 && _koefBdouble == 0 && _koefCdouble != 0) {
            System.out.println("\nVashe kvadratnoe uravnenie: " + _koefAstring + "x^2" + _koefCstring + " = 0");
        }

        // Если А != 0, B != 0, C == 0 (проверено)
        else if (_koefAdouble != 0 && _koefBdouble != 0 && _koefCdouble == 0) {
            System.out.println("\nVashe kvadratnoe uravnenie: " + _koefAstring + "x^2" + _koefBstring + "x" + " = 0");
        }

        // Если А == 0, B == 0, C != 0 (проверено)
        else if (_koefAdouble == 0 && _koefBdouble == 0 && _koefCdouble != 0) {
            if (_koefCdouble > 0) {
                _koefCstring = _koefCstring.replace(" ", "");
                _koefCstring = _koefCstring.substring(1);
                System.out.println("\n" + _koefCstring + " = 0???. Eto neravenstvo. Korney net");
            } else if (_koefCdouble < 0) {
                _koefCstring = _koefCstring.replace(" ", "");
                System.out.println("\n" + _koefCstring + " = 0???. Eto neravenstvo. Korney net");
            }
        }

        // Если А == 0, B != 0, C == 0 (проверено)
        else if (_koefAdouble == 0 && _koefBdouble != 0 && _koefCdouble == 0) {
            if (_koefBdouble > 0) {
                _koefBstring = _koefBstring.replace(" ", "");
                _koefBstring = _koefBstring.substring(1);
                System.out.println("\nVashe uravnenie: " + _koefBstring + "x" + " = 0 ne yavlyaetsya kvadratnym");
            } else if (_koefBdouble < 0) {
                _koefBstring = _koefBstring.replace(" ", "");
                System.out.println("\nVashe uravnenie: " + _koefBstring + "x" + " = 0 ne yavlyaetsya kvadratnym");
            }
        }

        // Если А != 0, B == 0, C == 0 (проверено)
        else if (_koefAdouble != 0 && _koefBdouble == 0 && _koefCdouble == 0) {
            System.out.println("\nVashe kvadratnoe uravnenie: " + _koefAstring + "x^2 = 0");
        }

        // Если А == 0, B == 0, C == 0 (проверено)
        else if (_koefAdouble == 0 && _koefBdouble == 0 && _koefCdouble == 0) {
            System.out.println("\nVashe uravnenie 0 = 0 bezogovorochno verno :)");
        }

        // Если А != 0, B != 0, C != 0 (проверено)
        else if (_koefAdouble != 0 && _koefBdouble != 0 && _koefCdouble != 0) {
            System.out.println("Vashe kvadratnoe uravnenie: " + _koefAstring + "x^2" + _koefBstring + "x" + _koefCstring + " = 0");
        } else System.out.println("Vashe kvadratnoe uravnenie ne suschestvuet!");

        if (_koefAdouble != 0) {
            D = Math.pow(_koefBdouble, 2) - 4 * _koefAdouble * _koefCdouble;

            if (D > 0) {
                x1 = (-_koefBdouble + Math.pow(D, 1.0 / 2.0)) / 2.0;
                x2 = (-_koefBdouble - Math.pow(D, 1.0 / 2.0)) / 2.0;
                _answer = "Korni uravneniya: x1 = " + Math.round(x1 * 100.0) / 100.0 + ", x2 = " + Math.round(x2 * 100.0) / 100.0;
            } else if (D < 0) {
                _answer = "Net veschestvennih korney";
            } else {
                x1 = (-_koefBdouble + Math.pow(D, 1.0 / 2.0)) / 2.0;
                _answer = "Uravnenie imeet tol'ko odin koren': x = " + Math.round(x1 * 100.0) / 100.0;
            }
        }

        return _answer;
    }
}
