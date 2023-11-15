package com.milewskiarkadiuszmodul8.account;

public class Adres {
    private String ulica = "Malczewskiego";
    private String kod = "02-354";
    private String miejscowosc = "Warszawa";
    private int numerDomu = 17;

    public Adres() {
        this.ulica = ulica;
        this.kod = kod;
        this.miejscowosc = miejscowosc;
        this.numerDomu = numerDomu;
    }
    public Adres(String ulica, String kod, String miejscowosc, int numerDomu) {
        this.ulica = ulica;
        this.kod = kod;
        this.miejscowosc = miejscowosc;
        this.numerDomu = numerDomu;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", kod='" + kod + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", numerDomu=" + numerDomu +
                '}';
    }
}
