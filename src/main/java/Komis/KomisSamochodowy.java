package Komis;

import java.util.Scanner;

public class KomisSamochodowy {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        OperacjeNaBazie.odczyt();
        System.out.println("Witaj w programie SUPER komis samochodów");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1 - dodać nowy samochód");
        System.out.println("2 - wyświetlić listę dodanych samochodów");
        System.out.println("3 - usunąć saochody");
        int wybor = scanner.nextInt();

        System.out.println("Wybrałeś opcję: " + wybor);

        switch (wybor) {
            case 1:
                OperacjeNaBazie.wyswietlanie();
                break;
            case 2:
                System.out.println("Co chcesz dalej zrobić?");
                System.out.println("1 - posortować i wyświetlić samochody");
                System.out.println("2 - użyć filtra i wyswietlić");
                break;
            case 3:
                break;
                default:
                    System.out.println("Wybierz cyfry od 1 do 3");
                    //ma sie cofnac do wyboru?
        }


    }
}
