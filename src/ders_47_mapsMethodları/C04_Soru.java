package ders_47_mapsMethodları;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04_Soru {
    public static void main(String[] args) {
        // verilen bir cumlede kullanılan karakterleri
        // ve kacar kere kullanıldıgını yazdırın

        String str="Javayı balonu patlatmadan bitirelim";
        //J=1, a=7,v=1, y=1....

        String[] strArr=str.split("");
        TreeMap<String,Integer> kullanımMiktarlarıMap= new TreeMap<>();

        for (int i= 0; i< strArr.length; i++){

            kullanımMiktarlarıMap.putIfAbsent(strArr[i],1);

            // ele aldıgım element Map2de varsa kullanım miktarını 1 artır
            kullanımMiktarlarıMap.computeIfPresent(strArr[i], (k,v)-> v+1);
             //ele aldıgım element map de yoksa kullanım miktarı 1 olarak  map'a ekleyecegim

        }

        System.out.println(kullanımMiktarlarıMap);







    }
}
