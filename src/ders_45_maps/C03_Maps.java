package ders_45_maps;

import ders_44_maps.MapDepo;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {
        // ogrenciler map'ınde subesi H olan ogrencilerin isim soyisi ve sınıflarını yazdıralım

        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();

        /*
        {
           101=Ali-Can-10-H-MF,
           102=Veli-Cem-11-M-Soz,
           103=Ali-Cem-11-H-TM,
           104=Ayse-Can-10H-TM,
           105=Ayse-Cem-11-M-TM,
           106=Fatma-Han-10K-Soz
           }
         */
         ogrenciMap.put(107,"Hasan-Yan-12-H-MF");
         ogrenciMap.put(101,"Adem-Fan-12-T-Soz");
        String subeadı="H";
        MapDepo.subeogrenciBilgileriniYazdır(ogrenciMap,subeadı);


    }
}
