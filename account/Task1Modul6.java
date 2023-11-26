package com.milewskiarkadiuszmodul8.account;

import java.util.Scanner;

public class Task1Modul6 {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        Konto konto = new Konto("1949 0004 1231231 1223");

        System.out.println("Wprowadź numer swojego konta skladajacego sie z 16-stu cyfr");
        String numerKonta = scanner.nextLine();
        konto.setNumerRachunku(numerKonta);
        double stanKonta = konto.getAccountBalance();
        boolean debet = konto.isDebet();

        System.out.println("Twoj numer rachunku to " + numerKonta + " i obecny stan konta to " + stanKonta);
        System.out.println("Konto posiada debet: " + debet);

        System.out.println("Podaj ile chcesz wpłacić środków?");
        double kwota = scanner.nextDouble();
        konto.setWplacSrodki(kwota);
//        11111 // Dlaczego w tym przypadku nie pobiera zauktualizowanego stanu konta?
        System.out.println(konto.getAccountBalance());

        System.out.println("Napisz ile chciałbyś wypłacić pieniędzy.");
        kwota = scanner.nextDouble();
        konto.setWyplacSrodki(kwota);

    }


}
