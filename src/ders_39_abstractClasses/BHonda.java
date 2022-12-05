package ders_39_abstractClasses;

public abstract class BHonda extends Araba{
    //Abstarct bir class i parent edindigimizde
    //iki altarnatifimiz olur
    //1- Parent'imiz olan abstract class2 daki abstract methodlar ları ovirride etmek
    //2- proje yaımız gerektiriyorsa bu class'i da abstract yapmak

    public void marka(){
        System.out.println("marka : Honda");
    }

    public abstract void  yakıt();
    public abstract void guvenlık();
    public void ozelTeknoloji(){
        System.out.println("Tum Honda arabalar vtec teknolojısı kullan");
    }



}
