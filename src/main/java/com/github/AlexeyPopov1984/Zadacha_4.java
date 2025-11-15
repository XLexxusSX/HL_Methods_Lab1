package com.github.AlexeyPopov1984;

public class Zadacha_4 {
    public static void dataEntryTask_4() {

        double maxElementSize = Math.pow(10, -6);
        double seriesSumVar = seriesSum(maxElementSize);
        seriesSumVar = Math.round(100000 * seriesSumVar) / 100000.0;
        System.out.println("\nRESHENIE ZADACHI 4:");
        System.out.println("Formula: element = 1 / n^2 + n - 2, gde n - poryadkoviy nomer elementa");
        System.out.println("Vychisleniya proizdodyatsya ot n = 2 do element >= 10^-6, pri n++");
        System.out.println("Otvet: summa ryada elementov ravna " + seriesSumVar + " (okrugleno do 5-ti znakov posle zapyatoy)");

    }

    private static double seriesSum (double maxElementSizeTrans) {
        double sum = 0, elementSize = 2;
        int n = 2;

        while (elementSize >= maxElementSizeTrans) {

            elementSize = 1 / (Math.pow(n, 2) + n - 2);
            sum += elementSize;
            n++;
        }

        return sum;
    }
}