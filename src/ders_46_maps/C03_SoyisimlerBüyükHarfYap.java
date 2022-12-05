package ders_46_maps;

import ders_44_maps.MapDepo;

import java.util.Map;

public class C03_SoyisimlerBüyükHarfYap {
    public static void main(String[] args) {

        // ogrenci map'indeki soyisimleri buyuk harfle cevirip
        //map'ibize donduren bir method olusturun

        Map<Integer,String> ogrenciMapi= MapDepo.ornekMapOlustur();
        ogrenciMapi.put(109,"Adem-Demir-11-D-Soz");

        ogrenciMapi=MapDepo.soyisimleriBuyukharfYap(ogrenciMapi);
        System.out.println(ogrenciMapi);



    }
}
