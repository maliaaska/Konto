package com.milewskiarkadiuszmodul8.account;

import java.util.Scanner;

public class Konto {

    Klient klient = new Klient();

    private String numerRachunku;
    private double stanKonta;

    private int nrDomu;
    private boolean debet = true;


    public Konto () {
        this.numerRachunku = "2934 9994 0000 0001 3458 8557";
        this.stanKonta = 850;
        this.debet = true;

    }

    public Konto(String numerRachunku, double stanKonta,int nrDomu, boolean debet) {
        this.numerRachunku = numerRachunku;
        this.stanKonta = stanKonta;
        this.nrDomu = nrDomu;
        this.debet = debet;


    }
    Waluta walutaPln = Waluta.PLN;
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
            System.out.println(" Twój obecny stan konta po wpłacie to " + stanKonta);
        } else if ( kwota > stanKonta){
            System.out.println("Nie masz wystarczających środków na koncie. Prosimy spróbować póżniej");
        } else {
            double stanKonta = this.stanKonta - kwota;
            System.out.println(" Twój obecny stan konta po wypłacie to " + stanKonta + " " + walutaPln);
        }
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public String getNumerRachunku() {
        return numerRachunku;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    public int getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(int nrDomu) {
        this.nrDomu = nrDomu;
    }

    public void setDebet(boolean debet) {
        this.debet = debet;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "klient=" + klient +
                ", numerRachunku='" + numerRachunku + '\'' +
                ", stanKonta=" + stanKonta +
                ", nrDomu=" + nrDomu +
                ", debet=" + debet +
                '}';
    }
}
