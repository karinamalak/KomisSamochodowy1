package Komis;


import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class OperacjeNaBazie {
    public static ArrayList<Samochod> lista = new ArrayList<>();

    public static void zapis(Samochod samochod) {

        try {

            FileOutputStream f = new FileOutputStream(new File("bazaSamochodow.txt"));

            ObjectOutputStream o = new ObjectOutputStream(f);


            // Write objects to file

            o.writeObject(samochod);

            // o.writeObject(p2);


            o.close();

            f.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found");

        } catch (IOException e) {

            System.out.println("Error initializing stream");

        }
    }

    public static void odczyt() {
        Object linia = new Object();
        try {

            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));

            ObjectInputStream oi = new ObjectInputStream(fi);


            // Read objects
            while ((linia =oi.)!= null) {
                //Samochod s1 = (Samochod) oi.readObject();
                lista.add((Samochod) oi.readObject());
                //zapis do listy
            }


           System.out.println(lista);

          //  System.out.println(pr2.toString());


            oi.close();

            fi.close();


        } catch (FileNotFoundException e) {

            System.out.println("File not found");

        } catch (IOException e) {

            System.out.println("Error initializing stream");

        } catch (ClassNotFoundException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }
    }
//    public static ArrayList<Samochod> lista = new ArrayList<>();
//
//    public static void zapisDoPliku(Samochod samochod) {
//        Object linia = new Object();
//        try {
//
//            FileOutputStream f = new FileOutputStream("bazaSamochodow.txt");
//
//            ObjectOutputStream o = new ObjectOutputStream(f);
//
//
//            // Write objects to file
//
//            o.writeObject(samochod);
//
//
//            o.close();
//
//            f.close();
//
//
//            FileInputStream fi = new FileInputStream(new File("bazaSamochodow.txt"));
//
//            ObjectInputStream oi = new ObjectInputStream(fi);
//
//
//            // Read objects
//
//            //do poki sa linijki w ppliku?
//            while (linia ==oi.readObject()) {
//                //Samochod s1 = (Samochod) oi.readObject();
//                lista.add((Samochod) oi.readObject());
//                //zapis do listy
//            }
//
//
//            oi.close();
//
//            fi.close();
//
//
//        } catch (FileNotFoundException e) {
//
//            System.out.println("File not found");
//
//        } catch (IOException e) {
//
//            System.out.println("Error initializing stream");
//
//        } catch (ClassNotFoundException e) {
//
//            // TODO Auto-generated catch block
//
//            e.printStackTrace();
//
//        }
//
//
//    }
}

