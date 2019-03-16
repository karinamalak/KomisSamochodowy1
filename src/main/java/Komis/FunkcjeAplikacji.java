package Komis;

import java.math.BigDecimal;

public class FunkcjeAplikacji {

    //wyswietlanie

    public static String[][] daneOdczytane = OperacjeNaBazie.getDaneOdczytane();


    public static void wyswietlanie() {
        for (int i = 0; i < daneOdczytane.length; i++) {
            for (int j = 0; j < daneOdczytane[i].length; j++) {
                switch(j) {
//                    case 0:
//                        System.out.println("Samochód nr: "+daneOdczytane[i][j]);
//                        break;
                    case 1:
                        System.out.println("Marka: "+daneOdczytane[i][j]);
                        break;
                    case 2:
                        System.out.println("Rocznik: "+daneOdczytane[i][j]);
                        break;
                    case 3:
                        System.out.println("Przebieg: "+daneOdczytane[i][j]);
                        break;
                    case 4:
                        System.out.println("Kolor: "+daneOdczytane[i][j]);
                        break;
                    case 5:
                        System.out.println("Liczba drzwi: "+daneOdczytane[i][j]);
                        break;
                    case 6:
                        System.out.println("Cena: "+daneOdczytane[i][j]);
                        break;
                }
            }
            System.out.println();
        }

    }





}
