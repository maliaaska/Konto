package com.milewskiarkadiuszmodul8.account;

public class Adres {
    private String ulica;
    private String kod;
    private String miejscowosc;
    private int numerDomu;

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
    public int getNumerDomu() {
        return numerDomu;
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
    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }

//    @Override
//    public String toString() {
//        return "Adres{" +
//                "ulica='" + ulica + '\'' +
//                ", kod='" + kod + '\'' +
//                ", miejscowosc='" + miejscowosc + '\'' +
//                ", numerDomu=" + numerDomu +
//                '}';
//    }
}
