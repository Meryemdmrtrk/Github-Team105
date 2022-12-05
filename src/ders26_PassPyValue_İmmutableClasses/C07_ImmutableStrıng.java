package ders26_PassPyValue_İmmutableClasses;

public class C07_ImmutableStrıng {
    public static void main(String[] args) {

        String str="Java Candır";
        str=str.toUpperCase();
        System.out.println(str); // JAVA CANDIR


        /*
        Immutable class'lardan olusturulan bir objenın degerı DEGISTIRILEMEZ
        Eger atama yaparsak java degerını degıstırmez
        bununyerıne yenı bıe obje olusturur
         ve bu yenı objen yenı atadıgınız degerı atar

         eskı obje bosa cıkar ve garbega collecter tarafından sılınmeyı bekler
         */

    }
}
