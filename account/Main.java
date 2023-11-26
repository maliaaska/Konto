package com.milewskiarkadiuszmodul8.account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Klient klient = new Klient("Arek", "Milewski", 1998, "arek@gmail.com","176-508-234");
        Adres adres = new Adres("Malczewskiego", "00-113", "Warszawa", 17);
        Konto konto = new Konto("1949 0004 1231231 1223", 850, true,  klient, adres );


        System.out.println("Wprowadź numer swojego konta skladajacego sie z 16-stu cyfr");
        String nrKonta = konto.getNumerRachunku();
        double stanKonta = konto.getAccountBalance(); // dlaczego przypisanie do tej zmiennej nie dziala
        boolean debet = konto.isDebet();

        System.out.println("Twoj numer rachunku to " + nrKonta + " i obecny stan konta to " + stanKonta);
        System.out.println("Konto posiada debet: " + debet);

        // Sprawdzanie czy uzytkownik posiada daną walutę
        Waluta walutaPln = Waluta.PLN;
//        Waluta walutaEur = Waluta.EUR;
//        Waluta walutaUsd = Waluta.USD;


        System.out.println("Podaj w jakiej walucie chcesz dokonać wpłaty? Podaj jeden z przykładów: PLN, EUR, USD"  );
        String waluta = scanner.nextLine();



        if ( walutaPln == Waluta.valueOf(waluta)){
            System.out.println("Podaj ile chcesz wpłacić środków?");
            double kwota = scanner.nextDouble();
            konto.setWplacSrodki(kwota);
            System.out.println("Twoje Środki po wpłaceniu to: " + konto.getAccountBalance() + " " + walutaPln);
        } else if ( Waluta.valueOf(waluta) != walutaPln ) {
            System.out.println("Niestety nie posiadasz konta o takiej walucie. Przyjdź do placówki aby utworzyć takie konto.");
        }



        System.out.println("Napisz ile chciałbyś wypłacić pieniędzy.");
        double wyplata = scanner.nextDouble();
        konto.setWyplacSrodki(wyplata);

        System.out.println(konto);


// below just a checker if the program gather data if the klient has polish currency.
//        System.out.println(walutaPln.hasCurrency());
//        System.out.println(walutaEur.hasCurrency());
//        System.out.println(walutaUsd.hasCurrency());
    }
}