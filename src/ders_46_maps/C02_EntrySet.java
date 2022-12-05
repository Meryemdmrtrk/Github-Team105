package ders_46_maps;

import ders_44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        // ogrenci map'ınde sıralı olarak
        // tum ogrencilerin
        // bolum, sınıf, sube, , isim , soyisim ve numaralarını yazdırın

        Map<Integer,String> ogrenciMapi= MapDepo.ornekMapOlustur();
        ogrenciMapi.put(109,"Adem-Demir-11-D-Soz");

        // Soz, 11, D, Adem Demir,109
        // Bu formatta String'ler oluşturup bir treeSet'e atalım
        // ve bu set'i bize döndüren bir Method oluşturalım

        Set<String> sıralıOgrenciListesi = MapDepo.sıralıOgrenciListesiOlustur(ogrenciMapi);

        System.out.println(sıralıOgrenciListesi);



    }
}
