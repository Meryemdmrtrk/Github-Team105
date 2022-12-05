package ders_45_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {
       //verilen bir cumlede kullanılan herbir harfi
       //ve o harfin kullanım miktarını
       //A=5 , B=3... gibi yazdırın

        String str="Javayı balonu patlatmadan bitirelim";
        //J=1 ,a=7, v=1 , y=1......

        String [] harflerArr=str.split("");
 // [J, a, v, a, y, ı,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m]

        Map<String,Integer>kullanımMiktarlarıMap=new TreeMap<>();
           int sayac=1;

        //1-tum harfleri sırası ile ele alacagız
        for (int i=0; i< harflerArr.length ; i++){

            //2- ele aldıgımız harfin daha once map'a eklenip eklenmedigini kontrol edelim
            if (kullanımMiktarlarıMap.containsKey(harflerArr[i])){
                continue;
            }else {
                //Kod buraya geldiyse o harf henuz map'e eklenmemistir.
                // o zaman bu harfin kullanım miktarını bulmalıyız

                for (int j= i+1; j< harflerArr.length ;j++){
                    if (harflerArr[j].equals(harflerArr[i])){
                        sayac++;

                    }
                }
                // sayma islemi bitti, Key ve Value' yu map'e ekleyelim
                kullanımMiktarlarıMap.put(harflerArr[i],sayac);
                sayac=1;
            }

        }



        System.out.println(Arrays.toString(harflerArr));




    }
}
