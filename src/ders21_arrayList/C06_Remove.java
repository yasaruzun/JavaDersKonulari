package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Remove {
    public static void main(String[] args) {

        int[]arr= {1,2,3,4,5,6,7,4,3,4,5,6,4,3,4,5,7,8,9,7};

        List<Integer> sayilar=new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {

            sayilar.add(arr[i]);


        }

        sayilar.remove(2);
        System.out.println(sayilar);//[1, 2, 4, 5, 6, 7, 4, 3, 4, 5, 6, 4, 3, 4, 5, 7, 8, 9, 7]
        sayilar.remove(5);//[1, 2, 4, 5, 6, 4, 3, 4, 5, 6, 4, 3, 4, 5, 7, 8, 9, 7]
        System.out.println(sayilar);

        // listemiz Integarlardan olusuyorsa biz int bir deger yazdigimizda
        // hep index olarak kabul ettiginden istedigimiz elementi obje olarak
        // girip sildirmek icin onceden tanimlamamız gerekir.


        Integer silinecekObje=4;
        sayilar.remove(silinecekObje);
        System.out.println(sayilar);

        //tum 3'leri sildirin


        silinecekObje=3;

        while(sayilar.contains(silinecekObje)){
            sayilar.remove(silinecekObje);



        }


        System.out.println(sayilar);



        sayilar.remove(20);// IndexOutOfBoundsException



    }
}
