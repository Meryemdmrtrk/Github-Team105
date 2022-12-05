package ders02_dataTurleri_Scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // soru 3- Kullanıcıdan ismini, soyismini ve yaşını alıp formatta yazdırın
        //   Ismınız : john
        //   Soyisminiz : Doe
        //   Yaşınız : 44
        //   Kaydınız başarıyla tamamlanmıştır.
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        // String için kullanılabilen next() sadece ilk space'e kadar olan kısmını alır
        //                            nextLine ise o satırda yazılan tüm bilgiyi alır

        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi yazınız");
        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasınızı giriniz");
        double yas= scan.nextDouble();

        System.out.println("Isminiz : " + isim +"\nsoyisminiz : "+ soyisim+
                "\nyasınız : "+ yas +"\nKaydınız basarıyla tamamlanmıstır.");





    }
}
