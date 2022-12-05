package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {


        // Kullanıcıdan ismini alıp, büyük harfle yazdırın
        // 1. adım : scan objesı olusturma

        Scanner scan = new Scanner(System.in);

        //2.adım: kullanıcıya ne ıstedıgınızı yazdırma
        System.out.println("Lutfen adınızı giriniz");

        //3.adım : kullanıcıdan ıstedıgınız bilginin turune uygun bir veriable olusturma
        //         scanner method'larından uygun olanını kullanarak alınan degeri
        //          varıble' atayalım

        String kullanıcıAdı= scan.next();

        System.out.println(kullanıcıAdı.toUpperCase());


    }
}
