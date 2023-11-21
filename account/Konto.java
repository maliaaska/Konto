package com.milewskiarkadiuszmodul8.account;

import java.util.Scanner;

public class Konto {

    Klient klient = new Klient();

    private double numerRachunku;
    private double stanKonta;

    private boolean debet = false;


    public Konto () {
        this.numerRachunku = numerRachunku;
        this.stanKonta = stanKonta;
        this.klient = klient;
        this.debet = debet;

    }

    public Konto(double numerRachunku, double stanKonta, Klient klient, boolean debet) {
        this.numerRachunku = numerRachunku;
        this.stanKonta = stanKonta;
        this.klient = klient;
        this.debet = debet;

    }

    // Metody
    public double getAccountBalance() {
          return stanKonta;
    }
    public boolean isDebet() {
        return false;
    }
    public String setNumerRachunku(String numer) {
        return numer;
    }

    public void setWplacSrodki(double kwota) {
        this.stanKonta = stanKonta + kwota;
///// dlaczego ta metoda nie dziala przy przypisuwaniu jej do nowego double (patrz klasa Konto)
    }

    public void setWyplacSrodki(double kwota) {
        if (debet) {
            double stanKonta = this.stanKonta - kwota;
            System.out.println(" Twój obecny stan konta po walce wyplacie to " + stanKonta);
        } else if ( kwota > stanKonta){
            System.out.println("Nie masz wystarczających środków na koncie. Prosimy spróbować póżniej");
        } else {
            double stanKonta = this.stanKonta - kwota;
            System.out.println(" Twój obecny stan konta po wypłacie to " + stanKonta);
        }
    }

    public double getNumerRachunku() {
        return numerRachunku;
    }

    public void setNumerRachunku(double numerRachunku) {
        this.numerRachunku = numerRachunku;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public void setDebet(boolean debet) {
        this.debet = debet;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "numerRachunku=" + numerRachunku +
                ", stanKonta=" + stanKonta +
                ", klient=" + klient +
                ", debet=" + debet +
                '}';
    }
}
