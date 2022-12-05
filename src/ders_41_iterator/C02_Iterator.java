package ders_41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        Iterator it1= sayilar.iterator();
       // tum elementleri şteraror kullanarak yazdıralım

        System.out.println(it1.hasNext());//true
        System.out.println(it1.next());// 10

        System.out.println(it1.hasNext());// true
        System.out.println(it1.next());//20

        System.out.println("=========");

        while (it1.hasNext()){
            System.out.println();
        }
        //iterator nereye kadariterate ettiysek orada kalır
        //bastan itibaren yazdırmak isterseniz, yeni bir iterartor olusturmanız gerekir

    }


}
