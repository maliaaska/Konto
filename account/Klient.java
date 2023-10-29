package com.milewskiarkadiuszmodul8.account;

public class Klient {
    private String imie;
    private String nazwisko;
    private int rokUrodzienia;
    private String email;
    private String telefon;

    private Adres adres;

    public Klient() {

    }

    public Klient(String imie, String nazwisko, int rokUrodzienia, String email, String telefon ) {
        System.out.println("Drugi konstruktor dziala");
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzienia = rokUrodzienia;
        this.email = email;
        this.telefon = telefon;

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getRokUrodzienia() {
        return rokUrodzienia;
    }

    public void setRokUrodzienia(int rokUrodzienia) {
        this.rokUrodzienia = rokUrodzienia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
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
                '}';
    }
}
