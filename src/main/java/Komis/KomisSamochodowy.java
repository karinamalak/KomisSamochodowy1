package Komis;

import java.math.BigDecimal;
import java.util.Scanner;

public class KomisSamochodowy {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        // OperacjeNaBazie.odczyt();
        menu();
    }

    public static void menu() {
        System.out.println("Witaj w programie SUPER komis samochodów");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1 - dodać nowy samochód");
        System.out.println("2 - wyświetlić listę dodanych samochodów");
        System.out.println("3 - usunąć saochody");
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
                FunkcjeAplikacji.dodawanie(samochod);
                System.out.println("Dodano nowy samochód do bazy.");
                menu();
                break;
            case 2:
                podmenu();
                break;
            case 3:
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
        int wybor2 = scanner.nextInt();
        switch (wybor2) {
            case 1:
                wyswietlanie();
                menu();
                break;
            case 2:
                sortowanie();
                wyswietlanie();
                menu();
                break;
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
        FunkcjeAplikacji.sortowanieTyp(FunkcjeAplikacji.pobieranieSamochodow(),wybor);
    }

}
