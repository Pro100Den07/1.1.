package org.example;

public class Main {

    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        System.out.println("Version 1.0.");

        double kgs = 8; // kilograms
        double pnds = 20; // pounds

        double pounds = convKgsToPounds(kgs);
        double kilos = convPoundsToKgs(pnds);

        System.out.println("Result: " + pounds + " pounds and " + kilos + " kilograms.");
    }

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }

    private static double convPoundsToKgs(double pnds) {
        return pnds / CONV_K;
    }
}