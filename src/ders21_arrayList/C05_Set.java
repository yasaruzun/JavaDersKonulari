package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Set {
    public static void main(String[] args) {


        int[]arr= {1,2,3,4,5,6,7,4,3,4,5,6,4,3,4,5,7,8,9,7};
        //list.set(index,yenideger) methodu
        //istenen indexteki eski degeri silip bize dondurur
        // ve o indexteki degeri verdigimiz yeni deger olarak atar


        List<Integer> sayilar=new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {

           sayilar.add(arr[i]);


        }
        //java'da genelde set() u update icin kullanilir
        // add ile set farklifir. set de var  olan bir elementi degistiyioruz

        System.out.println(sayilar.set(0, 9));//eski degeri de gormemizi saglar bu sek,lde yazilmasi
        sayilar.set(1,9);
        System.out.println(sayilar);


    }
}
