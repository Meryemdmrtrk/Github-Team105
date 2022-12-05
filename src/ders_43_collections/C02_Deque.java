package ders_43_collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        Deque<String> urunler = new LinkedList<>();
        urunler.add("Nutella");
        urunler.add("Cikolatalı Gofret");
        urunler.add("Cokoprens");


        // Tum urunlerin basına "Y" ekleyelim
          String eleman=" ";
          Deque geciciDeque= new LinkedList();

       while (eleman!=null){

       eleman=urunler.poll();

       if (eleman!= null);

        eleman= "Y" +eleman;

        geciciDeque.add(eleman);

       urunler=geciciDeque;

           System.out.println(urunler);


    }
}




       }
