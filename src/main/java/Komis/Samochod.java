package Komis;

import java.math.BigDecimal;

public class Samochod {

    private String kolor;//5
    private BigDecimal cena;//7
    private int iloscDrzwi;//6
    private String marka; //2
    private long przebieg; //4
    private int rocznik; //3
    private int id; //1

    public Samochod( int id, String marka, int rocznik, long przebieg, String kolor, int iloscDrzwi, BigDecimal cena) {
        this.kolor = kolor;
        this.cena = cena;
        this.iloscDrzwi = iloscDrzwi;
        this.marka = marka;
        this.przebieg = przebieg;
        this.rocznik = rocznik;
        this.id = id;
    }

    public Samochod() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public int getIloscDrzwi() {
        return iloscDrzwi;
    }

    public void setIloscDrzwi(int iloscDrzwi) {
        this.iloscDrzwi = iloscDrzwi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public long getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(long przebieg) {
        this.przebieg = przebieg;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }




}
