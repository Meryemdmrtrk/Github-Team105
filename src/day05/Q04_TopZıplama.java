package day05;

public class Q04_TopZıplama {
    public static void main(String[] args) {

        //Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.


        double yukseklık = 1000;


        double topunToplamYolu = 0;
        int yereVurmaSayisi = 0 ;

        do{
            yereVurmaSayisi++;
            topunToplamYolu += yukseklık;
            yukseklık*=0.75;
            topunToplamYolu += yukseklık;
        }while(yukseklık>=100);

        System.out.println("Topun yere vurma sayisi = " + yereVurmaSayisi +
                "\nTopun katettigi toplam yol = " + topunToplamYolu);

    }















    }

