package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // soru 4= kullanıcıdan bir dikdortgenin 2 kenar uzunlugunu alıp,
        // dikdortganin alanını yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdoergeninin iki kenar uzunlugunu girin" +
                "\niki kenar uzunlugu enter'a basın");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        System.out.println("dikdortgenin alanı : " +(kenar1*kenar2));

    }
}
