package com.milewskiarkadiuszmodul8.account;

public class Konto {
    private double stanKonta = 1223.86;
    private final boolean debet = false;

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
            System.out.println(" Twój obecny stan konta po  to " + stanKonta);
        }
        System.out.println("a new command");
    }
}
