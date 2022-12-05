package ders_44_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {



         Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);

        /*
         {

          102=Veli-Cem-11-M-Soz,
          103=Ali-Cem-11-H-TM,
          104=Ayse-Can-10H-TM,
          105=Ayse-Cem-11-M-TM,
          106=Fatma-Han-10K-Soz}
         */

        System.out.println(ogrenciMap.get(104));
        // 104 numaralı ogrencini value'sını döndürür
        //105 numaralı ogrencinin isim ve soyisimini yazdırın


        int ogrenciKey=106;

       String isimSoyisim=MapDepo.isimSoyisimDondur(ogrenciMap,ogrenciKey);


        System.out.println(ogrenciKey +"nolu ogrenci isimve soyisim :" + isimSoyisim);
        }

    }

