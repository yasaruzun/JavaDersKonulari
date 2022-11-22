package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {


        LinkedList<String> ll1=new LinkedList<>();

        ll1.add("K");
        ll1.add("T");

        /*
            LinkedList 3 tane interface'i implement etmistir
            List, Queue, Deque interface'lerini
            Dolayisiyla bu interface'lerden sonra gelen ilk concrete class oldugundan
            bu 3 interface'deki tum abstract methodlari override etmistir




            LinkedList olusturulurken secilen data turune gore
            bu 3 interface'den birinin ozelliklerini alabilir
            veya data turu LinkedList secilirse, 3 interface'in ozelliklerini de toptan alir
         */

        List<String> ll2=new LinkedList<>();

        /*
            Daha onceden arrayList olustururken , List<> interface'ini data turu olarak kullandigimizdan
            bu sekilde olusturulan LinkedList'lerin ozelliklerini biliyoruz
         */

        ll2.add("R");//[R]
        ll2.add("Z");
        ll2.add(0,"A");

        System.out.println(ll2);//[A, R, Z]


        ll2.addAll(2,ll1);

        System.out.println(ll2);//[A, R, K, T, Z]


        ll2.set(3,"M");



        ll2.add("K");
        ll2.add("T");
        System.out.println(ll2);//[A, R, K, M, Z, K, T]

        System.out.println(ll2.get(1));// R


        System.out.println(ll2.retainAll(ll1));//true

        System.out.println(ll2);//[K, K, T]

        System.out.println(ll2.hashCode());//104275

        System.out.println(ll2.subList(2, 3));//[T]



    }
}
