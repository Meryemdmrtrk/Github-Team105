package ders_43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<String>   dq1= new LinkedList<>();

        dq1.add("K");
        dq1.add("B");//[K,B]
        dq1.addLast("F");//[K,B,F]
        dq1.addFirst("A");//[A,K,B,F]


        System.out.println(dq1.getFirst());//A

        System.out.println(dq1.getLast());//F

        System.out.println(dq1.remove());//A
        System.out.println(dq1.poll());//K
        System.out.println(dq1.removeLast());// F
        System.out.println(dq1.remove());//B artık deque boş

        //dq1.remove();//NoSuchElementException
        System.out.println(dq1.poll());//null
        //boş deque olmasına ragmen exceptıon fırlatmaz,eleman silemedigi için bize null döndürür
        dq1.add("K");
        dq1.add("B");//[K,B]

        dq1.push("F");// [F,K,B]
        //deque'in basına element ekler
        //eğer deque ile ilgili sınırlandırma varsa ve yer kalmamışsa
        // illegalStateExceptıon verir

        System.out.println(dq1.pop());//F ilk elementi siler ve bize dondürür removeFirst() ile aynı işlevi gorur

        System.out.println(dq1.element());//K
        // ilk elementi silmeden bize döndürür. Boş deque' de çalışırsa exception fırlatır
        System.out.println(dq1.peek());//K
        // ilk elementi silmeden bize döndürür. Boş deque' de çalışırsa null döndürür

        System.out.println(dq1.peekFirst());//K
        System.out.println(dq1.peekLast());//B

        System.out.println(dq1.offer("C"));// true Liste ==>[K,B,C]
        System.out.println(dq1.offerFirst("M"));//true Liste==>[M,K,B,C]




        System.out.println(dq1);

    }
}
