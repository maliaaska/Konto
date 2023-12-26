package com.milewskiarkadiuszmodul8.account;

public class Konto {

    private String numerRachunku;
    private double stanKonta;
    private Klient posiadacz;

    private int nrDomu;

    private Waluta waluta;

    private double stanKontaUsd;
    private double stanKontaEur;

    public Konto(String numerRachunku, double stanKonta, Klient posiadacz, int nrDomu, Waluta waluta, double stanKontaUsd, double stanKontaEur) {
        this.numerRachunku = numerRachunku;
        this.stanKonta = stanKonta;
        this.posiadacz = posiadacz;
        this.nrDomu = nrDomu;
        this.waluta = waluta;
        this.stanKontaUsd = stanKontaUsd;
        this.stanKontaEur = stanKontaEur;

    }

    public boolean equals (Object o) {
        if (this == o ) {
            return true;
        }
        if ( o == null || this.getClass() != o.getClass()) {
            return false
        }

    }
    // Metody
    public double getAccountBalance() {
        return stanKonta;
    }

    public double getAccountBalanceUsd() {
        return stanKontaUsd;
    }

    public void setWplacSrodki(double kwota) {

        this.stanKonta = stanKonta + kwota;
    }

    public void setWplacSrodkiUsd(double kwota) {
        this.stanKontaUsd = stanKontaUsd + kwota;
    }

    public void setWplacSrodkiEur(double kwota) {
        this.stanKontaEur = stanKontaEur + kwota;
    }

    public void setWyplacSrodki(double kwota) {

        this.stanKonta = stanKonta - kwota;

        if (kwota > stanKonta) {
            System.out.println("Nie masz wystarczających środków na koncie. Prosimy spróbować póżniej");
        } else {
            System.out.println(" Twój obecny stan konta po wypłacie to " + stanKonta + " " + Waluta.PLN);
        }
    }

    public void setWyplacSrodkiUsd(double kwota) {

        this.stanKontaUsd = stanKontaUsd - kwota;

        if (kwota > stanKontaUsd) {
            System.out.println("Nie masz wystarczających środków na koncie. Prosimy spróbować póżniej");
        } else {
            System.out.println(" Twój obecny stan konta po wypłacie to " + stanKontaUsd + " " + Waluta.USD);
        }
    }

    public void setWyplacSrodkiEur(double kwota) {

        this.stanKontaEur = stanKontaEur - kwota;

        if (kwota > stanKontaEur) {
            System.out.println("Nie masz wystarczających środków na koncie. Prosimy spróbować póżniej");
        } else {
            System.out.println(" Twój obecny stan konta po wypłacie to " + stanKontaEur + " " + Waluta.EUR);
        }
    }

    public String getNumerRachunku() {
        return numerRachunku;
    }


    // GETTERS AND SETTERS


    public void setNumerRachunku(String numerRachunku) {
        this.numerRachunku = numerRachunku;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    public Klient getPosiadacz() {
        return posiadacz;
    }

    public void setPosiadacz(Klient posiadacz) {
        this.posiadacz.equals(posiadacz);
    }  //użycie metody equals

    public int getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(int nrDomu) {
        this.nrDomu = nrDomu;
    }

    public Waluta getWaluta() {
        return waluta;
    }

    public void setWaluta(Waluta waluta) {
        this.waluta = waluta;
    }

    public double getStanKontaUsd() {
        return stanKontaUsd;
    }

    public void setStanKontaUsd(double stanKontaUsd) {
        this.stanKontaUsd = stanKontaUsd;
    }

    public double getStanKontaEur() {
        return stanKontaEur;
    }

    public void setStanKontaEur(double stanKontaEur) {
        this.stanKontaEur = stanKontaEur;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "numerRachunku='" + numerRachunku + '\'' +
                ", stanKonta=" + stanKonta +
                ", posiadacz=" + posiadacz +
                ", nrDomu=" + nrDomu +
                ", waluta=" + waluta +
                ", stanKontaUsd=" + stanKontaUsd +
                ", stanKontaEur=" + stanKontaEur +
                '}';
    }
}
