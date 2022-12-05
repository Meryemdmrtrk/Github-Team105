package ders_44_maps;

import kotlin.jvm.internal.markers.KMutableMap;

import java.util.*;

public class MapDepo {

    //ogrenci map olusturup bize donduren bir method olusturun

    public static Map<Integer, String> ornekMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali-Cem-11-H-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-TM");
        ogrenciMap.put(105, "Ayse-Cem-11-M-TM");
        ogrenciMap.put(106, "Fatma-Han-10K-Soz");

        return ogrenciMap;


    }

    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {


        String ogrenciValue = ogrenciMap.get(ogrenciKey);// "Ayse-Cem-11-M-TM"

        String[] valueArr = ogrenciValue.split("-");//[Ayse,Cem,11,M,TM]

        String isimSoyisim = valueArr[0] + " " + valueArr[1];// Ayse Cem

        return isimSoyisim;
    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey, String yeniSube) {

        // istenen key map'de var mı?

        if (ogrenciMap.containsKey(ogrenciKey)) {
            //istenen Key varsa, update adip yeni map'i dondurecegiz

            String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey);//Ayse-Can-10-H-MF
            String[] istenenKeyValueArr = istenenKeyinValuesu.split("-");//[Ayse,Can,10,H,MF]
            // yeni sube degerini atayalım
            istenenKeyValueArr[3] = yeniSube;//[ Ayse,Can,10,K,MF]

            String istenenkeyinYeniValesu = istenenKeyValueArr[0] + "-" +
                    istenenKeyValueArr[1] + "-" +
                    istenenKeyValueArr[2] + "-" +
                    istenenKeyValueArr[3] + "-" +
                    istenenKeyValueArr[4];
            ogrenciMap.put(ogrenciKey, istenenKeyinValuesu);

        }
        return ogrenciMap;
    }

    {
    }

    public static void subeogrenciBilgileriniYazdır(Map<Integer, String> ogrenciMap, String subeadı) {
        Collection<String> valueCollection = ogrenciMap.values();
  /*

         [Ali-Can-10-H-MF,
         Veli-Cem-11-M-Soz,
         Ali-Cem-11-H-TM,
         Ayse-Can-10-H-TM,
         Ayse-Cem-11-M-TM,
         Fatma-Han-10K-Soz
         ]
         */
        System.out.println("ısım Soyısım sınıf");
        System.out.println("==================");
        for (String eachValue : valueCollection
        ) {
            // valu'yu parcalara ayır
            String[] valueArr = eachValue.split("-");//[Ayse,Can,10,H,MF]

            //sube ismini kontrol et, istenen sube ise isim,soyisim,sınıf yazdır
            if (valueArr[3].equals(subeadı)) {
                System.out.println(valueArr[0] + " " + valueArr[1] + " " + valueArr[2]);

            }
        }


    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {

        // hem Key, hem de value lazım oldugundan keySet'i olusturduk
        // sonra o key uzerınden value'yu map'den aldık
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // dondurecegimiz listeyi olusturalım

        List<String> isimListesi = new ArrayList<>();

        // Key degerlerini tek tek elden geçirip
        //istenen aralıkta olanları bulalım
        String value;
        String[] valueArr;
        String istenenIsim;
        for (Integer eachKey : ogrenciKeySeti
        ) {
            if (basNo<= eachKey && eachKey<= bitNo) {
                // buraya verilen sınır degerlerine uygun
                //eachKey'ler gelecek

                // sınıra uygun key'in value'sunu alalım
                value = ogrenciMap.get(eachKey);// Ayse-Can-10-H-MF
                //value'u parcalara ayıralım
                valueArr = value.split("-");// [Ayse,Can,10,H,MF]
                //value array'ından listeya eklenecek bilgileri alalım
                istenenIsim= valueArr[0] + " " + valueArr[1]+ " " + valueArr[4];

                // istenen ismi olusturduk, bunu listeye ekleyelim
                isimListesi.add(istenenIsim);


            }
        }
       return isimListesi;

    }

    public static void numaraIsimSoyisimYazdır(Map<Integer, String> ogrenciMap) {

        Set<Integer> keySeti=ogrenciMap.keySet();
        String value;
        String[] valueArr;

        for (Integer eachKey:keySeti
             ) {

            value=ogrenciMap.get(eachKey);
            valueArr=value.split("-");// [Ayse,Can,10,H,MF]

            System.out.println(eachKey +" " + valueArr[0] +" "+ valueArr[1]);


        }





    }

    public static Set<String> sıralıOgrenciListesiOlustur(Map<Integer, String> ogrenciMapi) {
     Set<String>sıralıOgrenciSeti=new TreeSet<>();

        // tum elementlerın key ve value'lerine birlikte ihtiyac oladugundan
        // Entry kullanmalıyız

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMapi.entrySet();
        
         // Herbir entry'i alden gecirip
        // bilgileri istedigimiz formatta alalım

        String istenenBilgi;
        String value;
        String[] valueArr;
        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti
             ) {
            // 101=Ali-Can-10-H-MF Entry
            //  bolum, sınıf, sube, , isim , soyisim ve numaralarını yazdırın

            value=eachEntry.getValue();
            valueArr=value.split("-");// [Ayse , Can , 10 , H , MF]



            istenenBilgi= valueArr[4]+", " + valueArr[2]+", " + valueArr[3]+", " +
                    valueArr[0]+" " +valueArr[1]+", " + eachEntry.getKey();

            sıralıOgrenciSeti.add(istenenBilgi);



            // Map'de herhangi bir degisiklik istenmediginden
            // arrayi yeniden birlestirip. entry.setValue() yapmamıza gerek yok
        }


     return sıralıOgrenciSeti;

    }


    public static Map<Integer, String> soyisimleriBuyukharfYap(Map<Integer, String> ogrenciMapi) {
        
         



        String istenen;
        String value;
        String[] valueArr;

        // soyisimleri buyultmek için one Entry set alalım
       Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMapi.entrySet();

        //entrySet'deki herbir entry'deki value'yu alalım
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {
            value=eachEntry.getValue();
           //value'yu split yapıp array'e cevirelim
            valueArr=value.split("-");//[Ayse , Can , 10 , H , MF]

            //array'de istedigimiz degisikligi yapalım
            valueArr[1] = valueArr[1].toUpperCase();

            // array'deki yeni bilgileri birlestirip eachEntry.setvalue(yeniValue)

            eachEntry.setValue(valueArr[0]+"-"+
                               valueArr[1]+"-"+
                               valueArr[2]+"-"+
                               valueArr[3]+"-"+
                               valueArr[4]);


        }
        
        

       return ogrenciMapi;
    }
}

