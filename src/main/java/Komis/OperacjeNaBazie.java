package Komis;


import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class OperacjeNaBazie {

    public static String PATH = "C:\\Users\\Karina\\IdeaProjects\\KomisSamochodowy\\src\\main\\java\\Komis\\bazaSamochodow";
    public static FileWriter fileWriter = null;
    public static BufferedWriter bufferedWriter = null;
    public static FileReader fr = null;
    public static String linia = "";
    public static String linia2 = "";
    public static ArrayList<String> lista = new ArrayList<>();
    public static String[][] daneOdczytane;
    public static int nrLinii = 0;

    public static void odczyt() {

        try {
            fr = new FileReader(PATH);
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }
        BufferedReader bfr = new BufferedReader(fr);


        //ZCZYTYWANIE KOLEJNYCH LINIJEK Z PLIKU TXT
        try {
            while ((linia = bfr.readLine()) != null) { //odczytuje z pliku linijka po linijce
                lista.add(linia); //wrzuca kolejne linijki do listy
            }

            daneOdczytane = new String[lista.size()][];
            for (String s : lista) {
                String[] liniaDaneString = s.split(";");
                String[] liniaDouble = new String[liniaDaneString.length];
                // Pętla, która pobiera z tablicy String-ów po jednej liczbie,
                // konwertuje ją na liczbę double i zapisuje w tablicy typu double[]
                for (int j = 0; j < liniaDouble.length; j++) {
                    liniaDouble[j] = liniaDaneString[j];
                }
                // Dodajemy tablicę z serią danych do tablicy z wszystkimi danymi
                daneOdczytane[nrLinii] = liniaDouble;
                // kolejna linia...
                nrLinii++;
            }



        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }

        try {
            fr.close(); //zamyka plik
        } catch (IOException e) {
            System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
            System.exit(3);
        }

    }

    public static String[][] getDaneOdczytane() {
        return daneOdczytane;
    }

    public static void setDaneOdczytane(String[][] daneOdczytane) {
        OperacjeNaBazie.daneOdczytane = daneOdczytane;
    }


    public static void dodawanie(Samochod samochod){
        linia = "";
        try {
            fileWriter = new FileWriter(PATH);
        } catch (IOException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }
        bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < daneOdczytane.length; i++) {
            for (int j = 0; j < daneOdczytane[i].length; j++) {
                linia2 += daneOdczytane[i][j] + ";";
            }
            try {
                bufferedWriter.write(linia2);
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            linia2="";
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
            System.exit(3);
        }


    }

}
