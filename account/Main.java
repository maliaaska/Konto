package com.milewskiarkadiuszmodul8.account;

import java.util.Scanner;

import static java.lang.System.err;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Adres adres = new Adres("Malczewskiego", "00-123", "Warsawa", 17);
        Klient klient = new Klient("Arek", "Milewski", 1998, "arek@gmail.com","176-508-234", adres);
        Waluta waluta = Waluta.PLN;

        Konto konto = new Konto("1949 0004 1231231 1223", 850, klient,  17, waluta, 0, 0  );

        String nrKonta = konto.getNumerRachunku();
        double stanKonta = konto.getAccountBalance();


        System.out.println("Twoj numer rachunku to " + nrKonta + " i obecny stan konta to " + stanKonta + " PLN");


        Waluta walutaPln = Waluta.PLN;



        System.out.println("Podaj w jakiej walucie chcesz dokonać wpłaty? Podaj jeden z przykładów: PLN, EUR, USD"  );
        String moneta = scanner.nextLine();



        // WPŁATA PIENIĘDZY

        if ( walutaPln == Waluta.valueOf(moneta)){
            System.out.println("Podaj ile chcesz wpłacić środków?");
            double kwota = scanner.nextDouble();
            konto.setWplacSrodki(kwota);
            System.out.println("Twoje Środki po wpłaceniu to: " + konto.getAccountBalance() + " " + moneta);

        } else if (Waluta.valueOf(moneta) == Waluta.USD) {
            System.out.println("Podaj ile chcesz wpłacić dolarów?");
            double kwota = scanner.nextDouble();
            konto.setWplacSrodkiUsd(kwota);
            System.out.println("Twoje Środki po wpłaceniu to: " + konto.getAccountBalanceUsd() + " " + moneta);

        } else if (Waluta.valueOf(moneta) == Waluta.EUR){
            System.out.println("Podaj ile chcesz wpłacić Euro?");
            double kwota = scanner.nextDouble();
            konto.setWplacSrodkiEur(kwota);
            System.out.println("Twoje Środki po wpłaceniu to: " + konto.getStanKontaEur() + " " + moneta);

        }
        else {
            System.out.println("Niestety nie posiadasz konta o takiej walucie. Przyjdź do placówki aby utworzyć takie konto. Teraz możesz wpłacić pieniądze w PLN");
        }


        //WYPŁATA PIENIEDZY W ZALEZNOSCI OD WYBRANEJ WALUTY


        if (Waluta.valueOf(moneta) == Waluta.PLN) {
            System.out.println("Napisz ile chciałbyś wypłacić pieniędzy.");
            double wyplata = scanner.nextDouble();
            konto.setWyplacSrodki(wyplata);
        }
        //Wyplata dolarow
        else if(Waluta.valueOf(moneta) == Waluta.USD) {
            System.out.println("Napisz ile chciałbyś wypłacić pieniędzy.");
            double wyplata = scanner.nextDouble();
            konto.setWyplacSrodkiUsd(wyplata);
        } else {
            //Wypłata EURO
            System.out.println("Napisz ile chciałbyś wypłacić pieniędzy.");
            double wyplata = scanner.nextDouble();
            konto.setWyplacSrodkiEur(wyplata);
        }




        System.out.println(konto);
    }
}