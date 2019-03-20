package Komis;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class FunkcjeAplikacji {
    private static final Scanner scanner = new Scanner(System.in);


    // public static String[][] daneOdczytane ;
    public static ArrayList<Samochod> lista = new ArrayList<>();
    private static BigDecimal suma = new BigDecimal(0);
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

    public static int pobieranieId() {
        int max = 0;
        for (Samochod l : lista
        ) {
            if (l.getId() > max) max = l.getId();
        }
        return max;
    }


    public static void dodawanie(Samochod samochod) {
        lista.add(samochod);
    }


    public static void sortowanie( List<Samochod> lista,int wybor) {
        switch (wybor) {
            case 1:
                lista.stream().sorted((o1, o2) -> o1.getMarka().compareTo(o2.getMarka())).forEach(System.out::println);

                break;
            case 2:
                lista.stream().sorted((o1, o2) -> o1.getCena().compareTo(o2.getCena())).forEach(System.out::println);
                break;
            case 3:
                lista.stream().sorted((o1, o2) -> o1.getKolor().compareTo(o2.getKolor())).forEach(System.out::println);
                break;
            case 4:
                lista.stream().sorted((o1, o2) -> o1.getIloscDrzwi() - o2.getIloscDrzwi()).forEach(System.out::println);
                break;
            case 5:
                lista.stream().sorted((o1, o2) -> o1.getRocznik() - o2.getRocznik()).forEach(System.out::println);
                break;
//             case 6:
//                samochod.stream().sorted((o1, o2) -> o1.getPrzebieg()-o2.getPrzebieg()).forEach(System.out::println);
//                break;

        }
    }

    public static List<Samochod> filtrowanie( List<Integer> filtr) {
        List<Samochod> listaFiltrowana = lista;
        for (Integer f : filtr
        ) {
            switch (f) {
                case 1:
                    System.out.println("Podaj jaką markę chcesz wyfiltrować: ");
                    String marka = scanner.nextLine();
                    listaFiltrowana = listaFiltrowana.stream()
                            .filter(samochod1 -> samochod1.getMarka().equals(marka))
                            .collect(Collectors.toList());
                    break;
                case 2:
                    System.out.println("Podaj jaką cene chcesz wyfiltrować: ");

                    listaFiltrowana = listaFiltrowana.stream()
                            .filter(samochod1 -> (samochod1.getCena().equals(scanner.nextBigDecimal())))
                            .collect(Collectors.toList());
                    break;
                case 3:
                    System.out.println("Podaj jaki kolor chcesz wyfiltrować: ");

                    listaFiltrowana = listaFiltrowana.stream()
                            .filter(samochod1 -> samochod1.getKolor().equals(scanner.nextLine()))
                            .collect(Collectors.toList());
                    break;
                case 4:
                    System.out.println("Podaj ile drzwi chcesz wyfiltrować: ");
                    listaFiltrowana = listaFiltrowana.stream()
                            .filter(samochod1 -> samochod1.getIloscDrzwi() == scanner.nextInt())
                            .collect(Collectors.toList());
                    break;
                case 5:
                    System.out.println("Podaj jaki rocznik chcesz wyfiltrować: ");

                    listaFiltrowana = listaFiltrowana.stream()
                            .filter(samochod1 -> samochod1.getRocznik() == scanner.nextInt())
                            .collect(Collectors.toList());
                    break;
                case 6:
                    System.out.println("Podaj jaki liczik chcesz wyfiltrować: ");
                    listaFiltrowana = listaFiltrowana.stream()
                            .filter(samochod1 -> samochod1.getPrzebieg() == scanner.nextLong())
                            .collect(Collectors.toList());
                    break;

            }
        }
        return listaFiltrowana;
    }

    public static void FiltrSort( List<Integer> filtr,int wybor) {
        sortowanie(filtrowanie(filtr),wybor);//wywolanie filtrowanie
        //sortowanie();
        //wywolanie sortowania
    }

    public static void usuwanie(int id) {

        for (Samochod l : lista
        ) {
            if (l.getId() == id) {
                suma = suma.add(l.getCena());//najpierw suma auta
                lista.remove(l);
                break;
            }
        }
    }

    public static BigDecimal sumaSprzedanych() {
        return suma;
    }


}
