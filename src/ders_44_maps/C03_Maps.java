package ders_44_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();

        //10. satırdan sonra map uzerınde yapacagımız her degisiklik
        // bu class daki ogrencimap'İ etkiler

        // map in bu halini bir gorelim

        System.out.println(ogrenciMap);
        /*
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10H-TM,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10K-Soz}







         */
        // map'a 1 tane yeni element ekleyelim

        ogrenciMap.put(110,"Fatih-Yan-10-T-MF");

        //102  numaralı ogrencıyı update edelim
        ogrenciMap.put(102,"Veli-Dem-12-D-Soz");

        System.out.println(ogrenciMap);

        //103 nolu ogrencinin isim ve soyismini yazdırın

        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap,103));//Ali Cem


        //105 numaralı ogrencının  subesını T yapın
       ogrenciMap= MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,105,"T");
        System.out.println(ogrenciMap);
        /*
            101=Ali-Can-10-H-MF,
            102=Veli-Dem-12-D-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10H-TM,
            105=Ayse-Cem-11-T-TM,
            106=Fatma-Han-10K-Soz,
            110=Fatih-Yan-10-T-MF
         */


    }
}
