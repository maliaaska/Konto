package com.milewskiarkadiuszmodul8.account;

public class Konto {

    private String numerRachunku;
    private double stanKonta;
    private Klient posiadacz;

    private int nrDomu;

    private Waluta waluta;

    public Konto(String numerRachunku, double stanKonta, Klient posiadacz, int nrDomu, Waluta waluta) {
        this.numerRachunku = numerRachunku;
        this.stanKonta = stanKonta;
        this.posiadacz = posiadacz;
        this.nrDomu = nrDomu;
        this.waluta = waluta;

    }

    // Metody
    public double getAccountBalance() {
          return stanKonta;
    }

    public void setWplacSrodki(double kwota) {

        this.stanKonta = stanKonta + kwota;
    }

    public void setWyplacSrodki(double kwota) {

        this.stanKonta = stanKonta - kwota;

        if ( kwota > stanKonta){
            System.out.println("Nie masz wystarczających środków na koncie. Prosimy spróbować póżniej");
        } else {
            System.out.println(" Twój obecny stan konta po wypłacie to " + stanKonta + " " + Waluta.PLN);
        }
    }

    public String getNumerRachunku() {
        return numerRachunku;
    }

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
        this.posiadacz = posiadacz;
    }

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

    @Override
    public String toString() {
        return "Konto{" +
                "numerRachunku='" + numerRachunku + '\'' +
                ", stanKonta=" + stanKonta +
                ", posiadacz=" + posiadacz +
                ", nrDomu=" + nrDomu +
                ", waluta=" + waluta +
                '}';
    }
}
