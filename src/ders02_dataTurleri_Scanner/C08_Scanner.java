package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        // Soru 7 (ınterview)- Kullanıcıdan iki sayı alıp ikisinin değerlerini değiştirin(swap)

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci tam sayıyı giriniz");
        int sayı1= scan.nextInt();

        System.out.println("Lutfen 2. tamsayıyı giriniz");

        int sayı2 = scan.nextInt();

        int bos;

        bos=sayı2;

        sayı2 = sayı1;

        sayı1=bos;

        System.out.println("sayı1'ın degeri :" + sayı1);
        System.out.println("sayı2'nin degeri :" + sayı2);




    }




}
