package com.github.AlexeyPopov1984;

import java.util.Scanner;

public class Zadacha_3 {
    public static void dataEntryTask_3() {
        Scanner scanner = new Scanner(System.in);
        String koefAstring = "", koefBstring = "", koefCstring = "", answer = "";
        double koefAdouble = 0, koefBdouble = 0, koefCdouble = 0;

        System.out.println("\nRESHENIE ZADACHI 3:");
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
            if (koefAstring.equals("1")) {
                koefAstring = "";
            }
            if (koefAstring.equals("-1")) {
                koefAstring = "-";
            }
        } else {
            System.out.println("Koeffitsient A: " + koefAdouble);
            koefAstring = "" + koefAdouble;
        }

        if (koefBdouble % 1 == 0) {
            System.out.println("Koeffitsient B: " + (int) koefBdouble);
            if (koefBdouble > 0)
                if (koefBdouble == 1) {
                    koefBstring = " + ";
                } else {
                    koefBstring = " + " + (int) koefBdouble;
                }
            else {
                if (koefBdouble == -1) {
                    koefBstring = " - ";
                } else {
                    koefBstring = " - " + (int) koefBdouble * (-1);
                }
            }
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

        answer = rootsSearching(koefAdouble, koefBdouble, koefCdouble, koefAstring, koefBstring, koefCstring);
        System.out.println(answer);
    }

    private static String rootsSearching(double koefAdoubleTrans, double koefBdoubleTrans, double koefCdoubleTrans, String koefAstringTrans, String koefBstringTrans, String koefCstringTrans) {
        String _answer = "";
        double D = 0, x1 = 0, x2 = 0;

        // Если А == 0, B != 0, C != 0 (проверено)
        if (koefAdoubleTrans == 0 && koefBdoubleTrans != 0 && koefCdoubleTrans != 0) {
            if (koefBdoubleTrans > 0) {
                koefBstringTrans = koefBstringTrans.replace(" ", "");
                koefBstringTrans = koefBstringTrans.substring(1);
                _answer = "\nVashe uravnenie " + koefBstringTrans + "x" + koefCstringTrans + " = 0 ne yavlyaetsya kvadratnym";
            } else if (koefBdoubleTrans < 0) {
                koefBstringTrans = koefBstringTrans.replace(" ", "");
                _answer = "\nVashe uravnenie " + koefBstringTrans + "x" + koefCstringTrans + " = 0 ne yavlyaetsya kvadratnym";
            }
        }

        // Если А != 0, B == 0, C != 0 (преверено)
        else if (koefAdoubleTrans != 0 && koefBdoubleTrans == 0 && koefCdoubleTrans != 0) {
            System.out.println("\nVashe kvadratnoe uravnenie: " + koefAstringTrans + "x^2" + koefCstringTrans + " = 0");
        }

        // Если А != 0, B != 0, C == 0 (проверено)
        else if (koefAdoubleTrans != 0 && koefBdoubleTrans != 0 && koefCdoubleTrans == 0) {
            System.out.println("\nVashe kvadratnoe uravnenie: " + koefAstringTrans + "x^2" + koefBstringTrans + "x" + " = 0");
        }

        // Если А == 0, B == 0, C != 0 (проверено)
        else if (koefAdoubleTrans == 0 && koefBdoubleTrans == 0 && koefCdoubleTrans != 0) {
            if (koefCdoubleTrans > 0) {
                koefCstringTrans = koefCstringTrans.replace(" ", "");
                koefCstringTrans = koefCstringTrans.substring(1);
                System.out.println("\n" + koefCstringTrans + " = 0???. Eto neravenstvo. Korney net");
            } else if (koefCdoubleTrans < 0) {
                koefCstringTrans = koefCstringTrans.replace(" ", "");
                System.out.println("\n" + koefCstringTrans + " = 0???. Eto neravenstvo. Korney net");
            }
        }

        // Если А == 0, B != 0, C == 0 (проверено)
        else if (koefAdoubleTrans == 0 && koefBdoubleTrans != 0 && koefCdoubleTrans == 0) {
            if (koefBdoubleTrans > 0) {
                koefBstringTrans = koefBstringTrans.replace(" ", "");
                koefBstringTrans = koefBstringTrans.substring(1);
                System.out.println("\nVashe uravnenie: " + koefBstringTrans + "x" + " = 0 ne yavlyaetsya kvadratnym");
            } else if (koefBdoubleTrans < 0) {
                koefBstringTrans = koefBstringTrans.replace(" ", "");
                System.out.println("\nVashe uravnenie: " + koefBstringTrans + "x" + " = 0 ne yavlyaetsya kvadratnym");
            }
        }

        // Если А != 0, B == 0, C == 0 (проверено)
        else if (koefAdoubleTrans != 0 && koefBdoubleTrans == 0 && koefCdoubleTrans == 0) {
            System.out.println("\nVashe kvadratnoe uravnenie: " + koefAstringTrans + "x^2 = 0");
        }

        // Если А == 0, B == 0, C == 0 (проверено)
        else if (koefAdoubleTrans == 0 && koefBdoubleTrans == 0 && koefCdoubleTrans == 0) {
            System.out.println("\nVashe uravnenie 0 = 0 bezogovorochno verno :)");
        }

        // Если А != 0, B != 0, C != 0 (проверено)
        else if (koefAdoubleTrans != 0 && koefBdoubleTrans != 0 && koefCdoubleTrans != 0) {
            System.out.println("\nVashe kvadratnoe uravnenie: " + koefAstringTrans + "x^2" + koefBstringTrans + "x" + koefCstringTrans + " = 0");
        } else System.out.println("\nVashe kvadratnoe uravnenie ne suschestvuet!");

        if (koefAdoubleTrans != 0) {
            D = Math.pow(koefBdoubleTrans, 2) - 4 * koefAdoubleTrans * koefCdoubleTrans;

            if (D > 0) {
                x1 = (-koefBdoubleTrans + Math.pow(D, 1.0 / 2.0)) / (2.0 * koefAdoubleTrans);
                x2 = (-koefBdoubleTrans - Math.pow(D, 1.0 / 2.0)) / (2.0 * koefAdoubleTrans);
                _answer = "Korni uravneniya: x1 = " + Math.round(x1 * 100.0) / 100.0 + ", x2 = " + Math.round(x2 * 100.0) / 100.0;
            } else if (D < 0) {
                _answer = "Net veschestvennih korney";
            } else {
                x1 = (-koefBdoubleTrans + Math.pow(D, 1.0 / 2.0)) / (2.0 * koefAdoubleTrans);
                _answer = "Uravnenie imeet tol'ko odin koren': x = " + Math.round(x1 * 100.0) / 100.0;
            }
        }

        return _answer;
    }
}
