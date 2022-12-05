package ders_45_maps;

import ders_44_maps.MapDepo;

import java.util.Map;

public class C05_EntrySet {
    public static void main(String[] args) {

      // ogrencı Map'inden Numara,isim,ve soyisim degerlerini yazdırelım

        Map<Integer,String> ogrenciMap=MapDepo.ornekMapOlustur();
        ogrenciMap.put(110,"Suleyman-Sah-11-T-MF");
        ogrenciMap.put(105,"Sule-Karaca-10-L-MF");

        MapDepo.numaraIsimSoyisimYazdır(ogrenciMap);





    }
}
