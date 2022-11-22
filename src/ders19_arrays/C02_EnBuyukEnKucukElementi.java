package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementi {
    public static void main(String[] args) {

        //verilen bir int array'de en kucuk ve en buyuk sayiları yazdiran bir method olusturun

        int[] arr={3,7,4,5,9,8,5,0,20};


        enKucukEnBuyukBulma(arr);

    }

    public static void enKucukEnBuyukBulma(int[] arr){

        Arrays.sort(arr);//kucukten buyuge dogru sıralar

        System.out.println("en buyuk element : "+ arr[arr.length-1]);
        System.out.println("en kucuk element : "+ arr[0]);
    }
}
