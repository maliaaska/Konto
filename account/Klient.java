package com.milewskiarkadiuszmodul8.account;

public class Klient {


    private String imie = "Arkadiusz";
    private String nazwisko = "Melika";
    private int rokUrodzienia = 1996;
    private String email = "arki@gmail.com";
    private String telefon = "77723-234324-23423";
    Waluta pln = Waluta.PLN;
    Adres adres = new Adres();

    public Klient() {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzienia = rokUrodzienia;
        this.email = email;
        this.telefon = telefon;
    }

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

    public Waluta getPln() {
        return pln;
    }

    public void setPln(Waluta pln) {
        this.pln = pln;
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
