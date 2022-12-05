package ders_46_maps;

import ders_44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {
       // ogrenci map'ınde sıralı olarak
       // tum ogrencilerin
       // bolum, sınıf, sube, , isim , soyisim ve numaralarını yazdırın

       // oneki ilk derste key(Set) ve value degerlerini(Collection) degerlerini toplu olarak alabiliyorduk
       // ancak key ve value birlikte kullanmak istedigimizde
       // bu işlemi yapmak zor olur

       // Bunun için Java Entry Class'ını olusturmustur
       // Entry'ler key=Value ikilisini 1Entry olarak kabul ederler

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size());// 6

        ogrenciMap.put(108,"Mehmet-Erkan-12-K-MF");


        /*
          101=Ali-Can-10-H-MF,
          102=Veli-Cem-11-M-Soz,
          103=Ali-Cem-11-H-TM,
          104=Ayse-Can-10-H-TM,
          105=Ayse-Cem-11-M-TM,
          106=Fatma-Han-10K-Soz}

         */
       Set<Map.Entry<Integer,String>> ogrenciEntrySeti  = ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);
        /*
        [
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-TM,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10K-Soz
        ]
        aralarındaki farklar
        1- yukarıdaki map, bu Set
        2- yukarıdakinde {} kullanılıyor, bu ise []
        3- yukarıdakinde key ve valu'ler her eleman icin bir arad ama ayrı ayrı bireyler
         Entry'de ise K=V ikisi birlikte bir element olusturuyor

         */

        // entry seti icersindeki antry'leri biz de sıra numarası vererek yazdıralım

        int sıraNo=1;

        for (Map.Entry<Integer,String>eachEntry: ogrenciEntrySeti){

            System.out.println(sıraNo +"-   "+eachEntry);
            sıraNo++;
        }
          //Entry'leri kullanarak Key'leri yazdıralım
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {
            System.out.println(eachEntry.getKey());
        }

        // entry'leri kullanarak tum ogrencilerin sısnıflarını 1 artırın
        //12. sınıfta olan varsa, map'tan cıkarın

        // tum entry'leri elden gecirelim
        String entryValue;
        String[] entryValueArr;
        for (Map.Entry<Integer,String>eachEntry:ogrenciEntrySeti
             ) {
            // herbir entry'deki valu'yu alıp parcalayıp istenen uptade'i yapıp,
            //yeniden map'a aklememiz lazım

            entryValue=eachEntry.getValue();// Ali-Can-10-H-MF
            entryValueArr=entryValue.split("-");//[Ali,Can,10,H,MF]


            if (entryValueArr[2].equals("12")){
                //ogrencinin sınıfı 12 ise

                eachEntry.setValue("Mezun oldu");


            } else {
            // ogrencinin sınıfı 12 degilse

           int sınıf=Integer.parseInt(entryValueArr[2]);
             sınıf ++;

            eachEntry.setValue(entryValueArr[0]+"-"+
                               entryValueArr[1]+"-"+
                               entryValueArr[2]+"-"+
                               entryValueArr[3]+"-"+
                               entryValueArr[4]);



            }
        }
        System.out.println(ogrenciMap);

    }
}
