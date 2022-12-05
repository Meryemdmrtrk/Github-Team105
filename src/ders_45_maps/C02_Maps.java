package ders_45_maps;

import ders_44_maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {
        // ogrenciler map'ınde subesi H olan ogrencilerin isim soyisi ve sınıflarını yazdıralım

        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();

        /*
           101=Ali-Can-10-H-MF,
           102=Veli-Cem-11-M-Soz,
           103=Ali-Cem-11-H-TM,
           104=Ayse-Can-10H-TM,
           105=Ayse-Cem-11-M-TM,
           106=Fatma-Han-10K-Soz
         */

      Set<Integer>ogrenciKeySet =ogrenciMap.keySet();// Bir map'deki key'leri Set olarak döndürür
        System.out.println(ogrenciKeySet);
        //[101, 102, 103, 104, 105, 106]

    Collection<String>ogrenciValueCollection = ogrenciMap.values();// Bir map'deki tum value'leri bize bir Collection olarak döndürür

        System.out.println(ogrenciValueCollection);
        /*

         [Ali-Can-10-H-MF,
         Veli-Cem-11-M-Soz,
         Ali-Cem-11-H-TM,
         Ayse-Can-10H-TM,
         Ayse-Cem-11-M-TM,
         Fatma-Han-10K-Soz]
         */
         /*
        Normalde bilgiler arasına java"," kullanır
        biz de virgül kullanabiliriz
        Ancak bu durumda value Collection'ini kac elemanlı olduguna dikkat etmemiz gerekir
        virgülle ayrılmıs cok fazla element olabilir
        Fakat Value'leri bir bütün olarak TEK BİR STRING oldugunu unutmamalıyız

[Ali,Can,10,H,MF, Veli,Cem,11,M,Soz, Ali,Cem,11,H,TM, Ayse,Can,10,H,TM, Ayse,Cem,11,M,TM, Fatma,Han,10,K,Soz]

          */

        System.out.println(ogrenciValueCollection.size());// 6
        //


    }
}
