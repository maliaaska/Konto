package com.milewskiarkadiuszmodul8.account;

public class Main {
    public static void main(String[] args) {
        // Konstruktor
        Adres adres = new Adres("Malczewskigo", "00-123", "Warszawa");

        Klient klient = new Klient("Arkadiusz", "Milewski", 1990,
                "asmilewski@eloelo.com", "+4899923323", adres);
        System.out.println(klient);

    }
}