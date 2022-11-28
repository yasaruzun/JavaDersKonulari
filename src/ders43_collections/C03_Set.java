package ders43_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {


        /*
            Verilen bir array'in tekrar eden elementlerini silip
            her element'in sadece 1 kere kullanildigi hale getirin
         */

        int[] arr={4,5,4,3,2,3,4,5,6,7,8,6,5,4,3,6,6,3,3,3,3,4,4,4,5,5,5};

        Set<Integer> geciciSet= new HashSet<>();

        for (Integer each:arr
             ) {
            geciciSet.add(each);
        }

        arr=new int[geciciSet.size()];//eski array e yeni boyut tanimladik

        //Set'deki benzersiz hale getirilen elementleri  array a tasiylaim

        int index=0;

        for (Integer each:geciciSet
             ) {
            arr[index]=each;
            index++;
        }

        //tekrarsiz degerleri gecici arr'e tasidik
        //simdi array'imize bu gecici array degerini atayalim


        System.out.println(Arrays.toString(arr));
    }
}
