package ders03_datacastıngwrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {


        int sayi =10;
        String str= "Java cok guzel";
        /*
         primitive data turleri sadece deger barindirirlar, hazir method'lari yoktur
         java'ya yapilan talepler nsonucunda java
         primitive data turleri ile bazi hazir method'larin kullanilabilmesi icin
         Wrapper class'lar olusturmustur.
         Wrapper class'lar primitive data turlerindeki degerleri alirlar
         ancak method'lari da vardir
         */

         char krk='b';

         Character krkWrapper='c';

         System.out.println(Character.isLetter('5'));// false

        System.out.println(Character.isLetter('7')); // true

        String str1="123";
        String str2="12";

        //star1 ve str2'nin degerlerini matematiksel olarak toplayıp

        System.out.println(str1 +str2);

        System.out.println(Integer.parseInt(str1) +Integer.parseInt(str2));
        // Integer .parsInteger (str) icicne yazılan str rakamlardan olusuyorsa str'i int2a cevirir
        // ancak bir karakter bile rakam degilse hata verir
        System.out.println(Integer.MAX_VALUE);//
        System.out.println(Short.MIN_VALUE);//




    }
}
