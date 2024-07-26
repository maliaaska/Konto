package com.milewskiarkadiuszmodul8.asmilewskiModul8;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = 0;

        System.out.println("Podaj ciąg dodatnich liczb całkowitych (zakończ 0):");
        int number;
        while ((number = scanner.nextInt()) != 0) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("Największa liczba w ciągu to: " + maxNumber);
    }
}
