package Komis;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Comparator;

public class Samochod implements Comparator<Samochod>, Serializable {

    private String kolor;//5
    private BigDecimal cena;//7
    private int iloscDrzwi;//6
    private String marka; //2
    private long przebieg; //4
    private int rocznik; //3
    private int id; //1

    public Samochod(int id, String marka, int rocznik, long przebieg, String kolor, int iloscDrzwi, BigDecimal cena) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Samochod " +
                "kolor: " + kolor +
                ", cena: " + cena +
                ", iloscDrzwi: " + iloscDrzwi +
                ", marka: " + marka +
                ", przebieg: " + przebieg +
                ", rocznik: " + rocznik +
                ", id: " + id +
                '}' + '\n';
    }

//    @Override
//    public static int compareTo(Samochod o) {
//        return 0;
//    }

    @Override
    public int compare(Samochod o1, Samochod o2) {
        return 0;
    }

    @Override
    public Comparator<Samochod> reversed() {
        return null;
    }

}
