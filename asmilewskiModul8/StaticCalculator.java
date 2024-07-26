package com.milewskiarkadiuszmodul8.asmilewskiModul8;

public class StaticCalculator {
        public static final double X = 18;
        public static final double Y = 13;
        public double result;

        public static void dodawanie(double x, double y) {
            double result = x + y;
            System.out.println("Wynik dodawania to " + result);
        }

        public static void odejmowanie(double x, double y) {
            double result = x - y;
            System.out.println("Wynik odejmowania to " + result);
        }

        public static void  mnożenie(double x, double y) {
            double result = x * y;
            System.out.println("Wynik Mnożenia to " + result);
        }

        public static void  dzielenie (double x, double y) {
            double result = x / y;
            System.out.println("Wynik dzielenia to " + result);
        }
        public static void main(String[] args) {

            StaticCalculator.dodawanie(13, 18);
            StaticCalculator.odejmowanie(13, 18);
            StaticCalculator.mnożenie(13, 18);
            StaticCalculator.dzielenie(13, 18);

        }
    }
