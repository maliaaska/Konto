package com.milewskiarkadiuszmodul8.account;

import com.milewskiarkadiuszmodul6.banking.Konto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        com.milewskiarkadiuszmodul6.banking.Konto konto = new Konto();

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

        System.out.println(konto.getAccountBalance());

        System.out.println("Napisz ile chciałbyś wypłacić pieniędzy.");
        kwota = scanner.nextDouble();
        konto.setWyplacSrodki(kwota);



        Adres adres = new Adres("Malczewskiego", "00-113", "Warszawa", 14);

        Waluta walutaPln = Waluta.PLN;
        Waluta walutaEur = Waluta.EUR;
        Waluta walutaUsd = Waluta.USD;

        Klient klient = new Klient("Arkadiusz", "Milewski", 1990,
                "asmilewski@eloelo.com", "+4899923323", adres, walutaPln );
        System.out.println(klient);

// below just a checker if the program gather data if the klient has polish currency.
        System.out.println(walutaPln.hasCurrency());
        System.out.println(walutaEur.hasCurrency());
        System.out.println(walutaUsd.hasCurrency());
    }
}