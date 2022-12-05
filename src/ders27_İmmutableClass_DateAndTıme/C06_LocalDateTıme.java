package ders27_İmmutableClass_DateAndTıme;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C06_LocalDateTıme {
    public static void main(String[] args) {


        LocalDateTime zaman = LocalDateTime.now();
        System.out.println(zaman); // 2022-10-29T18:30:07.085363
        System.out.println(zaman.getDayOfYear()); // 302
    }
}












