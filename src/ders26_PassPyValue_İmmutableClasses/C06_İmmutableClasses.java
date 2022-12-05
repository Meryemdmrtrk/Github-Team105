package ders26_PassPyValue_İmmutableClasses;

import java.util.List;

public class C06_İmmutableClasses {
    public static void main(String[] args) {

        String str= "Java guzeldir";

        System.out.println(str.toUpperCase()); // JAVA GUZELDIR

        System.out.println(str); // java guzeldır

        str.toLowerCase();

        System.out.println(str); // Java guzeldır

        // Strıng immutable oldugun ıcın, method ıle yapılan degısıkler Strıng i kalıcı degıstırmez



    }
}
