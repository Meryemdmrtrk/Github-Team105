package day05;

import java.util.Scanner;

public class Q2_GırılenSayılarınEbBuyugunuBulma {

    // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen her sayıdan sonra Enter'a basarak 5 adet sayı gırınız : ");
        int enBuyukSayi = 0;
        int sayac = 0 ;

        while (sayac<5){
            int sayi = scan.nextInt();
            if(sayi>enBuyukSayi){
                enBuyukSayi = sayi ;
            }
            sayac++;
        }
        System.out.println("Girilen sayilarin en buyugu = " + enBuyukSayi);

    }







    }


