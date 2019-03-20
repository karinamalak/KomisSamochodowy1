package Komis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KomisSamochodowy {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Samochod s1 = new Samochod(1, "volvo", 2012, 20000, "red", 3, new BigDecimal(30000));
        OperacjeNaBazie.zapis(s1);
     //   FunkcjeAplikacji.dodawanie(s1);
        Samochod s2 = new Samochod(2, "acura", 2018, 200000, "blue", 5, new BigDecimal(10000));
        OperacjeNaBazie.zapis(s2);
        Samochod s3 = new Samochod(2, "volvo", 2018, 200000, "blue", 5, new BigDecimal(10000));
        OperacjeNaBazie.zapis(s3);
         OperacjeNaBazie.odczyt();

        menu();
    }

    public static void menu() {
        System.out.println("Witaj w programie SUPER komis samochodów");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1 - dodać nowy samochód");
        System.out.println("2 - wyświetlić listę dodanych samochodów");
        System.out.println("3 - usunąć samochody");
        System.out.println("4 - suma sprzedanych aut");
        System.out.println("5 - wyjscie");
        int wybor = scanner.nextInt();

        System.out.println("Wybrałeś opcję: " + wybor);

        switch (wybor) {
            case 1:
                scanner.nextLine();
                Samochod samochod = new Samochod();
                System.out.println("Wprowadź markę samochodu: ");
                samochod.setMarka(scanner.nextLine());
                System.out.println("Wprowadź rocznik samochodu: ");
                samochod.setRocznik(scanner.nextInt());
                System.out.println("Wprowadź przebieg samochodu: ");
                samochod.setPrzebieg(scanner.nextLong());
                scanner.nextLine();
                System.out.println("Wprowadź kolor samochodu: ");
                samochod.setKolor(scanner.nextLine());
                System.out.println("Wprowadź ilość drzwi: ");
                samochod.setIloscDrzwi(scanner.nextInt());
                System.out.println("Wprowadź cenę samochodu: ");
                samochod.setCena(scanner.nextBigDecimal());
                samochod.setId(FunkcjeAplikacji.pobieranieId() + 1); //+ 1 do max(id) z listy
                FunkcjeAplikacji.dodawanie(samochod);
                System.out.println("Dodano nowy samochód do bazy.");
                menu();
                break;
            case 2:
                podmenu();
                break;
            case 3:
                System.out.println("Podaj Id samochodu, który chcesz usunąć: ");
                int usId = scanner.nextInt();
                FunkcjeAplikacji.usuwanie(usId);
                menu();
                break;
            case 4:
                System.out.println("Suma sprzedanych aut wynosi: " + FunkcjeAplikacji.sumaSprzedanych());
                break;
            case 5:
                System.exit(1);
                break;
            default:
                System.out.println("Wybierz cyfry od 1 do 3");
                menu();
        }
    }


    public static void podmenu() {
        System.out.println("Co chcesz dalej zrobić?");
        System.out.println("1 - posortować i wyświetlić samochody");
        System.out.println("2 - użyć filtra i wyswietlić");
        System.out.println("3 - użyć filtra, posortować i wyświetlić");
        int wybor2 = scanner.nextInt();
        switch (wybor2) {
            case 1:
                sortowanie(); //od najmniejszego do najwiekszego
                // wyswietlanie();
                menu();
                break;
            case 2:
                filtrowanie();
                //  wyswietlanie();

                menu();
                break;
            case 3:
                filtrSort();
                menu();
            default:
                System.out.println("Wybierz cyfry od 1 lub 2");
                podmenu();
        }
    }

    public static void wyswietlanie() {
        for (Samochod samochód : FunkcjeAplikacji.pobieranieSamochodow()
        ) {
            System.out.println(samochód);
        }

    }

    public static void sortowanie() {
        System.out.println("Wybierz po jakich polach chcesz sortować: ");
        System.out.println("1 - marka");
        System.out.println("2 - cena");
        System.out.println("3 - kolor");
        System.out.println("4 - ilość drzwi");
        System.out.println("5 - rocznik");
        System.out.println("6 - przebieg");
        int wybor = scanner.nextInt();
        FunkcjeAplikacji.sortowanie(FunkcjeAplikacji.pobieranieSamochodow(), wybor);
    }

    public static void filtrowanie() {
        System.out.println("Wpisz po ilu polach chcesz filtrować: ");
        int ileFiltrow = scanner.nextInt();
        List<Integer> filtr = new ArrayList<>();
        int wybor;
        System.out.println("Wybierz po jakich " + ileFiltrow + " polach chcesz filtrować: ");
        System.out.println("1 - marka");
        System.out.println("2 - cena");
        System.out.println("3 - kolor");
        System.out.println("4 - ilość drzwi");
        System.out.println("5 - rocznik");
        System.out.println("6 - przebieg");
        for (int i = 1; i <= ileFiltrow; i++) {
            System.out.println("Podaj " + i + " filtr: ");
            filtr.add(scanner.nextInt());
        }
        scanner.nextLine();
        System.out.println(FunkcjeAplikacji.filtrowanie(filtr));

    }

    public static void filtrSort() {
        System.out.println("Wpisz po ilu polach chcesz filtrować: ");
        int ileFiltrow = scanner.nextInt();
        List<Integer> filtr = new ArrayList<>();
        System.out.println("Wybierz po jakich " + ileFiltrow + " polach chcesz filtrować: ");
        System.out.println("1 - marka");
        System.out.println("2 - cena");
        System.out.println("3 - kolor");
        System.out.println("4 - ilość drzwi");
        System.out.println("5 - rocznik");
        System.out.println("6 - przebieg");
        for (int i = 1; i <= ileFiltrow; i++) {
            System.out.println("Podaj " + i + " filtr: ");
            filtr.add(scanner.nextInt());
        }

        scanner.nextLine();

        System.out.println("Wybierz po jakich polach chcesz sortować: ");
        System.out.println("1 - marka");
        System.out.println("2 - cena");
        System.out.println("3 - kolor");
        System.out.println("4 - ilość drzwi");
        System.out.println("5 - rocznik");
        System.out.println("6 - przebieg");
        int wybor = scanner.nextInt();

        FunkcjeAplikacji.FiltrSort(filtr, wybor);

    }

}
