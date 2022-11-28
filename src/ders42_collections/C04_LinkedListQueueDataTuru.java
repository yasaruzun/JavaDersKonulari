package ders42_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataTuru {
    public static void main(String[] args) {

        Queue<String> q1=  new LinkedList<>();

        q1.add("H");
        q1.add("Y");

        q1.offer("K");
        //kapasite sinirlamasi yapmadiginiz surece add() ile ayni islemi yapar

        q1.remove(); // Queue eklemeyi son'a yapip, kullanmayi bastan yaptigi icin
                     //parametreyi girmedigimizde bastaki elemani remove eder ve bize dondurur

        q1.remove();

        q1.remove();//bos liste kaldi

       // q1.remove();// queue bos oldugundan NoSuchElementException verir

        System.out.println(q1.poll());//null
        /*
            q1.poll() remove ile ayni islemi yapar,
            yani bastaki elementi siler ve bize dondürür
            aralarindaki fark bos queue'da calistiririldiklarinda remove exception firlatirken
            poll exception firlatmaz

          */


        System.out.println(q1);

    }
}
