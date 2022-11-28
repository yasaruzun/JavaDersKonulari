package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {


        Deque<String> dq1= new LinkedList<>();

        dq1.add("K");
        dq1.add("B");
        dq1.addLast("A");
        dq1.addFirst("A");

        System.out.println(dq1.getFirst());//A
        System.out.println(dq1.getLast());//A

        System.out.println(dq1.remove()); //hem siler,hem getirir A
        System.out.println(dq1.poll());// bu da ilk i siler ve getirir K
        System.out.println(dq1.removeLast());//sondaki indexsi siler ve bize getirir A
        System.out.println(dq1.remove());//B siler, artik deque bos

        //dq1.remove() // exception firlatir

        System.out.println(dq1.poll());//null
        //bos deque olmasina ragmen exception firlatmaz, eleman silemedigi icin bize null döndürüradı

        dq1.add("K");
        dq1.add("B");

        dq1.push("F");
        /*
            deque'in basina element ekler
            eger deque ile ilgili sinirlandirma varsa ve yer kalmamissa
            illegalStateException verir
            addFirst ile aynidir

         */

        System.out.println(dq1.pop());
        //bu removeFirst ile ayni,  siler ve bize dondürür

        System.out.println(dq1.element());
        //ilk elementi getirir ama silmez. bos olursa exception firlatir

        System.out.println(dq1.peek());
        //ilk elementi getirir ama silmez. bos olursa exception firlatmaz. null yazdirir

        System.out.println(dq1.peekFirst());//K
        System.out.println(dq1.peekLast());//B

        System.out.println(dq1.offer("C"));//true veriyor yerleştirdiği icin

        System.out.println(dq1.offerFirst("M"));//true dondu>>[M, K, B, C]


        System.out.println(dq1);

    }
}
