package ders_43_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {
        Set<Integer> sayılar=new HashSet<>();

        sayılar.add(12);
        sayılar.add(15);

        Set<Integer> sıralıSet= new TreeSet<>();

        sıralıSet.add(23);
        sıralıSet.add(34);
        sıralıSet.addAll(sayılar);

        System.out.println(sıralıSet);//[12,15,23,34]

        // bir hashset ve bir tree set olusturalım
        // ikisine de random 1000 tane sayı ekleyip
        //islem surelerini kıyaslayalım
        Random rnd = new Random();
        int sayi;
        LocalTime hashBas= LocalTime.now();
        for (int i = 0; i <8000 ; i++) {
            sayi= rnd.nextInt();
            sayılar.add(sayi);
        }
        LocalTime hashBit= LocalTime.now();
        LocalTime treeBas= LocalTime.now();
        for (int i = 0; i <8000 ; i++) {
            sayi= rnd.nextInt(100000);
            sıralıSet.add(sayi);
        }
        LocalTime treeBit= LocalTime.now();
        System.out.println("hashSet bas: " + hashBas + " bitis: " + hashBit);
        System.out.println("treeSet bas: " + treeBas + " bitis: " + treeBit);
        System.out.println("hash suresi : " + (hashBit.getNano()-hashBas.getNano()));
        System.out.println("tree suresi : "+  (treeBit.getNano()-treeBas.getNano()));
    }
}











