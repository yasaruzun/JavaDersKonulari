package ders41_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //iterator kullanarak , Liste'nin elementlerini sondan bas'a dogru yazdirin

        //once iterator u son a goturelim

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()) {
            lit.next();

        }
        //simdi sondan bas'a dogru gidelim, giderken elemenlteri yazidralim

        while(lit.hasPrevious()){
            System.out.print(lit.previous()+" ");//40 30 20 10

        }


        //eger iterator u nerede biraktigimizi hatirlayamazsak iterator.nextIndex ile hangi index'in oncesinde oldugumuzu gorebilriz.
        System.out.println("");
        System.out.println(lit.nextIndex());//0- iterator un bulundugu index i buluoruz

        //iterator kullanarak,  liste'nin tum elementlerini  5 arttirin

        while (lit.hasNext()){

            lit.set(((Integer)lit.next())+5);
        }
        System.out.print(sayilar);//[15, 25, 35, 45]

        //iterator kullanarak 40'dan kucuk olan elementleri silin

        System.out.println(lit.nextIndex());//4.index

        Integer element;
        while(lit.hasPrevious()){

            element= (Integer) lit.previous();
            if(element<40){
                lit.remove();

            }
        }
        System.out.println(sayilar);//[45]
    }
}