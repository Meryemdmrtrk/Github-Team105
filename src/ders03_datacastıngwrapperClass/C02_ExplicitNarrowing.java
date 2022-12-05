package ders03_datacastıngwrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayı = 20;

        /*
        genis data turundeki bir degeri
        dar data turundeki bir varıable'a atamak ısterseniz
        java sorumllulugu almanızı ister

        bu sorumlulugu almak icicn
        cast edecegınız deger'in onune () icerisinde
        cast etmek istedigimiz data turu yazılır

        ancak bu dudrumda data kayıpları (double'den int'e gecerken virgulden sonrası silinir)
        veya baskalasım olabilir(int'i byte cevirirsek tekrar tekrar basa doner)

         */

        short sh = (short) sayı;

        System.out.println(sh); // 20

        double dbl = 23.5;
        int say = (int) dbl;

        System.out.println(say); //23

        say = 256; // int
        byte byt = (byte) say;

        System.out.println(byt); // -128


    }
}