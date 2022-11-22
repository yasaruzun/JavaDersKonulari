package ders19_arrays;

import java.util.Arrays;

public class  C08_ArrayeElemanEklemeMethodu {
    public static void main(String[] args) {
        // verilen bir int array'e istenen bir element'i ekleyip
        //yeni halini bize döndüren bir method olusturun

        int [] arr={3,5,8,9,4,5,6,5};
        int eklenecekSayi=10;

        arr=arrayeElemanEkle(arr,eklenecekSayi);

        System.out.println(Arrays.toString(arr));// [3, 5, 8, 9, 4, 5, 6, 5, 10]
    }


    public static int[] arrayeElemanEkle(int [] Arr, int eklenecekSayi){

        int[] yeniArray=new int[Arr.length+1];

        for (int i = 0; i <Arr.length ; i++) {

            yeniArray[i]=Arr[i];


        }
        yeniArray[yeniArray.length-1]=eklenecekSayi;

        return yeniArray;

    }
}
