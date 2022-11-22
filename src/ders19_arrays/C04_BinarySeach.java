package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySeach {
    public static void main(String[] args) {

        int[] arr= {1,8,3,7,2,5,8,1};


        System.out.println(Arrays.binarySearch(arr,8));//6

        System.out.println(Arrays.binarySearch(arr,5));//-2 , 5  aslında var ama bulamadı.

        /*
        Binary Search methodu'nun dogru sonuclar verebilmesi icin oncelikle sort methodu kullanilmalidir.

        sort kullamadan binarysearch ile yapilan aramanin sonucu belli olmaz. dogru sonuc da verebilir, yanlis sonuc da.

         */

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[1, 1, 2, 3, 5, 7, 8, 8]

        System.out.println(Arrays.binarySearch(arr,7));//5.index
        System.out.println(Arrays.binarySearch(arr,8));//6.index
        System.out.println(Arrays.binarySearch(arr,5));//4.index

        //array'de olmayan bir eleman aratirsak
        //java önce o sayi array'de olsa nerede olurdu onu bulur
        //sonra buldugu bu SIRA'yi - isareti ile verir
        System.out.println(Arrays.binarySearch(arr,-3));//-1
        System.out.println(Arrays.binarySearch(arr,100));//-9
        System.out.println(Arrays.binarySearch(arr,50));//-9
        //- vermesinin nedeni olsaydı nerede olurdu'nun ceabını veriyor aslın sadece tahmin ediyor.



    }
}
