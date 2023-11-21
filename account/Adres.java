package com.milewskiarkadiuszmodul8.account;

public class Adres {
    private String ulica;
    private String kod;
    private String miejscowosc;
    private int numerDomu;

    public Adres() {
        this.ulica = "Malczewskiego";
        this.kod = "00-123";
        this.miejscowosc = "Warszawa";
        this.numerDomu = 17;
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
