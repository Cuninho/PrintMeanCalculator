package com.company;

import com.sun.source.doctree.SummaryTree;

public class PrintMean {

    public static void main(String[] args) {
        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc (1, + 1, + 3, + 3));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc (1, + 2, + 3, + 4));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc (1, - 2, + 3, - 4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc (-1, - 11, + 24, + 2));

    }
// Gör en sträng av mean värdet
    // Lösa heltal till decimaltal
    public static  String meanCalc(int a, int b, int c, int d) {
        int mean = (a + b + c + d) / 4;
        double sum = (a+b+c+d)/4;
        String meanString = "" + mean;

        return meanString;
    }
}
