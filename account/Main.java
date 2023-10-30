package com.milewskiarkadiuszmodul8.account;

public class Main {
    public static void main(String[] args) {
        // Konstruktor
        Adres adres = new Adres("Malczewskiego", "00-113", "Warszawa", 14);

        Klient klient = new Klient("Arkadiusz", "Milewski", 1990,
                "asmilewski@eloelo.com", "+4899923323", adres);
        System.out.println(klient);

    }
}