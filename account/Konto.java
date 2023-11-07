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
            this.stanKonta = stanKonta + kwota;
            System.out.println(" Twój obecny stan konta po wyplacie to " + kwota);
        } else if ( kwota > this.stanKonta){
            System.out.println("Nie masz wystarczających środków na koncie. Prosimy spróbować póżniej");
        } else {
            this.stanKonta = stanKonta - kwota;
            System.out.println(" Twój obecny stan konta po wyplacie to " + kwota);
        }

    }
}
