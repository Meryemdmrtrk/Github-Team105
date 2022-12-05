package ders_43_collections;

import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {
       //verilen bir array'in tekrar eden elementlerini silip
       // her elementin 1 kere kullanıldıgı hale getirin


        int  [] arr ={6,4,3,2,3,5,6,4,3,2,4,6,3,2,1,2,4,5,5,1};

        Set<Integer> geciciSet= new HashSet<>();

        for (Integer each: arr
        ){
            geciciSet.add(each);

        }
        int [] geciciArr=new int[geciciSet.size()];// yeni ve bos bir array var
        // Set'deki benzersiz hale getirilen elementleri geciciArr 'ye tasıyalım

        int index=0;
        for (Integer each:geciciSet
        ){
            arr[index]=each;
            index++;
        }


















    }
}
