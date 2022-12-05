package ders_37exceptıons;

public class C02_ClassCastException {

    public static void main(String[] args) {

        short sayı1=23;
        int sayı2=sayı1;

        short sayı3=24;
       // Integer sayı4=sayı3; Integer ve Short arasında paren-chıld iliskisi olmadıgından
       // birbirine atama yapamazsınız

        //Aralarında parent-child iliskisi olan class'lardan olusan objeler icin
        // auto-widening veye explicit-narrowing mumkundur

        Object obj= sayı3;
        System.out.println("Short'dan objeye cast edince : "+obj);

        Integer sayı5=(Integer)obj;

        System.out.println("Short'dan datayı obje uzerinden Integer'a cevırınce : " +sayı5 );

                //ClassCastExceptıon


        }

    }


