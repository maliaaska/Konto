package com.milewskiarkadiuszmodul8.account;

public class Konto {

    private String numerRachunku;
    private double stanKonta;
    private boolean debet;


    public Konto(String numerRachunku, double stanKonta, boolean debet, Klient klient, Adres adres) {
        this.numerRachunku = numerRachunku;
        this.stanKonta = stanKonta;
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

        this.stanKonta = stanKonta - kwota;

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

    public String getNumerRachunku() {
        return numerRachunku;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    public void setDebet(boolean debet) {
        this.debet = debet;
    }

    public Waluta getWalutaPln() {
        return walutaPln;
    }

    public void setWalutaPln(Waluta walutaPln) {
        this.walutaPln = walutaPln;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "numerRachunku='" + numerRachunku + '\'' +
                ", stanKonta=" + stanKonta +
                ", debet=" + debet +
                ", walutaPln=" + walutaPln +
                '}';
    }
}
