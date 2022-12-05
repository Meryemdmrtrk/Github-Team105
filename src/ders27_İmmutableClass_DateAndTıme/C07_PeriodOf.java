package ders27_İmmutableClass_DateAndTıme;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

       // dogumunuzdan bugune ne kadar zaman gecti ?

        LocalDate bugun = LocalDate.now();
        LocalDate dogumgunu=LocalDate.of(1980,01,04);

        Period gecensure=Period.between(dogumgunu,bugun);
         System.out.println(gecensure); // P42Y9M25D

         System.out.println(gecensure.getYears());// 42












    }
}
