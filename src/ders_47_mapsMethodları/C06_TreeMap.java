package ders_47_mapsMethodları;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMap {
    public static void main(String[] args) {
       TreeMap<String,Integer> mp1= new TreeMap<>();
        mp1.put("A",5);
        mp1.put("H",3);
        mp1.put("C",7);
        mp1.put("T",3);
        mp1.put("F",8);

        System.out.println(mp1);//{A=5, C=7, F=8, H=3, T=3
        System.out.println(mp1.higherKey("D"));//F
        System.out.println(mp1.higherKey("H"));//T
        System.out.println(mp1.higherKey("U"));//null

        System.out.println(mp1.higherEntry("M"));//T=3
        System.out.println(mp1.lowerEntry("F"));//C girilen degerden kucuk
        System.out.println(mp1.lowerEntry("G"));//{C=7, F=8, H=3}


        System.out.println(mp1.headMap("K"));//{A=5, C=7, F=8, H=3}

        System.out.println(mp1.headMap("F",true));//{A=5, C=7, F=8}
        System.out.println(mp1.headMap("N",true));//{A=5, C=7, F=8, H=3}

        System.out.println(mp1.tailMap("F"));//{F=8, H=3, T=3}

            System.out.println(mp1.tailMap("D"));//{F=8, H=3, T=3}
            System.out.println(mp1.tailMap("F", true));//{F=8, H=3, T=3}
             System.out.println(mp1.tailMap("F", false));//{H=3, T=3}
              //false dersek girilen dahil degil, sona kadar


            System.out.println(mp1.ceilingKey("F"));//F verilen degere esıt veya buyuk olan
             System.out.println(mp1.ceilingKey("B"));//C
              System.out.println(mp1.ceilingEntry("H"));//H-3

        System.out.println(mp1.floorKey("D"));// C girilen degere esit veya buyuk olan
        System.out.println(mp1.floorKey("H"));//H
        System.out.println(mp1.floorEntry("L"));//H-3
        System.out.println(mp1.floorEntry("T"));//T-3

        System.out.println(mp1.pollFirstEntry());//A=5
        System.out.println(mp1);//{C=7, F=8, H=3, T=3}

        System.out.println(mp1.pollLastEntry());//T=3
        System.out.println(mp1);//{C=7, F=8, H=3}


        System.out.println(mp1.subMap("B","G"));//{C=7, F=8}
        System.out.println(mp1.subMap("C","H"));//{C=7, F=8} baslangıc inclusıve ,bitis exclusive

        System.out.println(mp1.subMap("C",false,"H",true));
       // {F=8, H=3}
    }



    }