package ders03_datacastıngwrapperClass;

public class C01_DataCastıng {
    public static void main(String[] args) {
        /*
        bazı data turlerı asla birbirine cast edılemez

        */

       // String str=20;

       // boolean mutluMu="true";

        // int a=ture;

        double s = 20;
        int sayı = 15;
        //long ln = sayı; // esıtlıgın sol tarafı long,sag tarafı yani deger int
                         // java ıtıraz etmedi

        /*
          dar data turunden bir degeri
           genis data turundeki varıable' a atama yaparsanız
           java bunu otomatık olarak yapar
         */

        short sh= 23;

        int a=sh;

        long lng= sh;

        float fl= lng;

        /*
        ama tersını yapmak ıstersenız
        yanı buyuk bır data turundeki bir degeri
        kucuk data turundeki variable'a atamak isterseniz java kabul etmez
         */
        double dbl= 20;

        // a = dbl;
        // short abc = dbl;




    }
}
