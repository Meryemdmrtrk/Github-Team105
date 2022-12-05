package ders02_dataTurleri_Scanner.ders22_arrayLıst;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {3,5,7,8,4,2,6,9,6,4,5};

        // bu array'daki 5' den buyuk olan tum elementlerı toplayalım

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>5){
                toplam += arr[i];
            }
        }

System.out.println("for loop ile : "+ toplam);

         // for-each loop daha basit bir kugu ile calısır
        // for-each loop2'a 3 seyi soylememiz lazım
        // 1- hangi data turunde





    }
}
