package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_contains {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        int[] arr={2,5,6,9,1,0,4,5,6,7,8,5,4};

        for (int i = 0; i <arr.length ; i++) {

            sayilar.add(arr[i]);
        }


        System.out.println(sayilar.contains(5));//true

        System.out.println(sayilar.contains(3));//false




    }
}
