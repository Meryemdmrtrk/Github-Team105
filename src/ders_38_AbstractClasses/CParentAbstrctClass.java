package ders_38_AbstractClasses;

public class CParentAbstrctClass {
    /*
    Abstract bir class abstract methodlara sahip olabilir
    Bir class2i abstract yapmak için class declaration2ına abstract keyword eklenmelidir

     */
    public void mecburiMethod1(){
        System.out.println("parent abstract method 1");
    }
    /*
    Bir parent class 'da class'ların mutlaka ovirride edecegi bir method olusturdugumuzda
    method body'si gereksizleşir
    çünkü hic calişmayacaktır

    1-abstract perent class dan obje oluşturulamayacağı için bu method kullanılamaz
    2- child class lar da mecburen bu method u ovirride edeceklerinden,
    bu methodları body'si asla KULLANILMAYACAKTIR

    java hiç kullanılmayacak bu method body2leri yazmamıza imkan tanımıştır.

    Chıld class'ların mutlaka ovirride etmesini
    istedigimiz methodları abstract olarak tanımlar ve body'siz olarak oluştururuz.


     */

}
