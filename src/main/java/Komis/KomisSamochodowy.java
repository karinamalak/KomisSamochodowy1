package Komis;

import java.math.BigDecimal;
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

        switch(wybor) {
            case 1:
                Samochod samochod =new Samochod();
                System.out.println("Wprowadź markę samochodu: ");
                samochod.setMarka(scanner.nextLine());
                System.out.println("Wprowadź rocznik samochodu: ");
                samochod.setRocznik(scanner.nextInt());
                System.out.println("Wprowadź przebieg samochodu: ");
                samochod.setPrzebieg(scanner.nextLong());
                System.out.println("Wprowadź kolor samochodu: ");
                samochod.setKolor(scanner.nextLine());
                System.out.println("Wprowadź ilość drzwi: ");
                samochod.setIloscDrzwi(scanner.nextInt());
                System.out.println("Wprowadź cenę samochodu: ");
                samochod.setCena(scanner.nextBigDecimal());



                break;
            case 2:
                System.out.println("Co chcesz dalej zrobić?");
                System.out.println("1 - posortować i wyświetlić samochody");
                System.out.println("2 - użyć filtra i wyswietlić");
                int wybor2 = scanner.nextInt();
                switch(wybor2) {
                    case 1:
                      FunkcjeAplikacji.wyswietlanie();
                        break;
                    case 2:
                        FunkcjeAplikacji.wyswietlanie();
                        break;
                        default:
                            System.out.println("Wybierz cyfry od 1 lub 2");
                            //ma sie cofnac do wyboru?
                }
                break;
            case 3:
                break;
                default:
                    System.out.println("Wybierz cyfry od 1 do 3");
                    //ma sie cofnac do wyboru?
        }


    }
}
