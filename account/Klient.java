package com.milewskiarkadiuszmodul8.account;

public class Klient {
    private String imie;
    private String nazwisko;
    private int rokUrodzienia;
    private String email;
    private String telefon;

    private Adres adres;

    Waluta pln = Waluta.PLN;

    public Klient(String imie, String nazwisko, int rokUrodzienia, String email, String telefon, Adres adres, Waluta pln) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzienia = rokUrodzienia;
        this.email = email;
        this.telefon = telefon;
        this.adres = adres;
        this.pln = pln;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzienia=" + rokUrodzienia +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres=" + adres +
                ", pln=" + pln +
                '}';
    }
}
