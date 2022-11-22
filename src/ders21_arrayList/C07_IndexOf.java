package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_IndexOf {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 4, 3, 4, 5, 6, 4, 3, 4, 5, 7, 8, 9, 7};

        List<Integer> sayilar = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);


        }

        System.out.println(sayilar.indexOf(2));//1-----2'nin kullanildigi ilk index
        System.out.println(sayilar.indexOf(5));//4
        System.out.println(sayilar.lastIndexOf(5));//15 son kullanılan 5'in indexini verecek ama bastan sayacak


    }
}
