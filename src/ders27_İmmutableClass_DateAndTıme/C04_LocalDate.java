package ders27_İmmutableClass_DateAndTıme;

import java.time.LocalDate;
import java.util.Locale;

public class C04_LocalDate {
    public static void main(String[] args) {


        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);  // 2022-10-29
        System.out.println(tarih.minusDays(100)); // 2022-07-21
        System.out.println(tarih.minusWeeks(5).minusDays(3)); // 2022-09-21
        System.out.println(tarih.plusMonths(5)
                .plusWeeks(2)
                .plusDays(3)); // 2023-04-15

        System.out.println(tarih.getMonthValue());//10
        System.out.println(tarih.getMonth());//OCTABER
        System.out.println(tarih.getDayOfWeek()); //SATURDAY
        System.out.println(tarih.getDayOfYear()); // 302

        System.out.println(tarih.isLeapYear()); // false



    }
}
































