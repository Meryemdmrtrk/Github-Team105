package ders_45_maps;


import ders_44_maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {
         // ogrenci map'inde numarası  verilen sayıların arasında(sınırlar dahil)olan ogrencilerin
        //isim soyisim ve Bolumlerini List olarak bize döndüren bir method olusturun

        /*

         [Ali-Can-10-H-MF,
         Veli-Cem-11-M-Soz,
         Ali-Cem-11-H-TM,
         Ayse-Can-10-H-TM,
         Ayse-Cem-11-M-TM,
         Fatma-Han-10K-Soz]
         */


        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        ogrenciMap.put(107,"Tugay-Cil-12-K-MF");
        ogrenciMap.put(103,"Hikmet-Saglam-11-M-Soz");
        int basNo=102;
        int bitNo=103;
        List<String> isimListesi= MapDepo.numaraDegerineGoreListeOlustur(ogrenciMap,basNo,bitNo);
        System.out.println(isimListesi);










    }
}
