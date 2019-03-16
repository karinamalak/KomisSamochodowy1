package Komis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FunkcjeAplikacji {

    //wyswietlanie

   // public static String[][] daneOdczytane ;
    public static ArrayList<Samochod> lista = new ArrayList<>();
    //=
//rozmiar tablicy
    //tablica pusta be rozmiaru


//    public static void wyswietlanie() {
//        for (int i = 0; i < daneOdczytane.length; i++) {
//            for (int j = 0; j < daneOdczytane[i].length; j++) {
//                switch(j) {
////                    case 0:
////                        System.out.println("Samochód nr: "+daneOdczytane[i][j]);
////                        break;
//                    case 1:
//                        System.out.println("Marka: "+daneOdczytane[i][j]);
//                        break;
//                    case 2:
//                        System.out.println("Rocznik: "+daneOdczytane[i][j]);
//                        break;
//                    case 3:
//                        System.out.println("Przebieg: "+daneOdczytane[i][j]);
//                        break;
//                    case 4:
//                        System.out.println("Kolor: "+daneOdczytane[i][j]);
//                        break;
//                    case 5:
//                        System.out.println("Liczba drzwi: "+daneOdczytane[i][j]);
//                        break;
//                    case 6:
//                        System.out.println("Cena: "+daneOdczytane[i][j]);
//                        break;
//                }
//            }
//            System.out.println();
//        }
//
//    }

//    public static void dodawanie(Samochod samochod){
//       daneOdczytane = new String[OperacjeNaBazie.nrLinii+1][]; //+1 bo robi miejsce na nowy samochod
//        daneOdczytane = OperacjeNaBazie.getDaneOdczytane();
//
//        for (int i = daneOdczytane.length-2; i < daneOdczytane.length; i++) {
//            daneOdczytane[i] =
//
//        }


  //  }

    public static List<Samochod> pobieranieSamochodow() {
            return lista;
    }


    public static void dodawanie(Samochod samochod){
        lista.add(samochod);
    }

    public static List<Samochod> sortowanieTyp(List<Samochod> samochod, int wybor){


        switch(wybor) {
            case 1:
                samochod.stream().sorted((o1, o2) -> o1.getMarka().compareTo(o2.getMarka()));
                break;
            case 2:
                samochod.stream().sorted((o1, o2) -> o1.getCena().compareTo(o2.getCena()));
                break;
            case 3:
                samochod.stream().sorted((o1, o2) -> o1.getKolor().compareTo(o2.getKolor()));
                break;
            case 4:
                samochod.stream().sorted((o1, o2) -> o1.getIloscDrzwi()-o2.getIloscDrzwi());
                break;
            case 5:
                samochod.stream().sorted((o1, o2) -> o1.getRocznik()-o2.getRocznik());
                break;
           // case 6:
            //    samochod.stream().sorted((o1, o2) -> o1.getPrzebieg()-o2.getPrzebieg());
            //    break;

        }



        return samochod;
    }

    public static void sortowanie(){

    }

    public static void filtrowaie(Samochod samochod){

    }




}
