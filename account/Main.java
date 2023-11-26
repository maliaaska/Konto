package com.milewskiarkadiuszmodul8.account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Adres adres = new Adres("Malczewskiego", "00-123", "Warsawa", 17);
        Klient klient = new Klient("Arek", "Milewski", 1998, "arek@gmail.com","176-508-234", adres);
        Waluta waluta = Waluta.PLN;
        Konto konto = new Konto("1949 0004 1231231 1223", 850, klient,  17, waluta );

        String nrKonta = konto.getNumerRachunku();
        double stanKonta = konto.getAccountBalance(); // dlaczego przypisanie do tej zmiennej nie dziala


        System.out.println("Twoj numer rachunku to " + nrKonta + " i obecny stan konta to " + stanKonta);

        // Sprawdzanie czy uzytkownik posiada daną walutę
        Waluta walutaPln = Waluta.PLN;



        System.out.println("Podaj w jakiej walucie chcesz dokonać wpłaty? Podaj jeden z przykładów: PLN, EUR, USD"  );
        String moneta = scanner.nextLine();



        if ( walutaPln == Waluta.valueOf(moneta)){
            System.out.println("Podaj ile chcesz wpłacić środków?");
            double kwota = scanner.nextDouble();
            konto.setWplacSrodki(kwota);
            System.out.println("Twoje Środki po wpłaceniu to: " + konto.getAccountBalance() + " " + moneta);
        } else if ( Waluta.valueOf(moneta) != waluta.PLN ) {
            System.out.println("Niestety nie posiadasz konta o takiej walucie. Przyjdź do placówki aby utworzyć takie konto. Teraz możesz wpłacić pieniądze w PLN");
        }



        System.out.println("Napisz ile chciałbyś wypłacić pieniędzy.");
        double wyplata = scanner.nextDouble();
        konto.setWyplacSrodki(wyplata);

        System.out.println(konto);
    }
}