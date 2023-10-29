package com.milewskiarkadiuszmodul8.account;

public class Main {
    public static void main(String[] args) {
        // Konstruktor
        Klient klientDomyślny = new Klient("Arkadiusz", "Milewski", 1990,
                "asmilewski@eloelo.com", "+4899923323" );
        System.out.println(klientDomyślny);
    }

    Klient klientAdres = new Klient("Arkadiusz", "Milewski", 1990,
            "asmilewski@eloelo.com", "+4899923323");
}
