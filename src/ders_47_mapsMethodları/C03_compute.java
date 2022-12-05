package ders_47_mapsMethodları;

import java.util.HashMap;
import java.util.Map;

public class C03_compute {
    public static void main(String[] args) {

        Map<String,Integer> mp1= new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);
        //C key olarak varsa degerini 3 artır


        if (mp1.containsKey("C")){

            mp1.put("C", mp1.get("C")+3);

        }
        System.out.println(mp1);//{A=5, B=3, C=10}
         // Bkey olarak vrsa degerini 2 şle carp

        mp1.computeIfPresent("B", (k,v)-> 2*v);
        System.out.println(mp1);//{A=5, B=6, C=10}

        // "A" key olarak varsa degerini 5 azaltın
        mp1.computeIfPresent("A",(k,v)-> v-5);//5
        System.out.println(mp1);//{A=5, B=6, C=10}


        // Map'de D yoksa value'su 11 olavak sekılde ekleyelım

        if (!mp1.containsKey("D")){

            mp1.put("D",11);

        }
        System.out.println(mp1);//{A=5, B=3, C=10, D=11}
       // E yoksa degeri 8 olarak ekleyelim

        mp1.computeIfAbsent("E", v->8);
        System.out.println(mp1);//{A=0, B=6, C=10, D=11, E=8}

        //E degerini 4 artır

        mp1.compute("E",(k,v)-> v+4);
        System.out.println(mp1);//{A=0, B=6, C=10, D=11, E=12}

        mp1.compute("R", (k,v)-> v=3);
        System.out.println(mp1);



        mp1.compute("F", (k,v)-> v*3);//null
        System.out.println(mp1);//


    }
}
