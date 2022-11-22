package ders26_passByValue_ImmutableClasses;

import java.util.Arrays;

public class C03_PassByValueArray {
    public static void main(String[] args) {
        //verilen bir array'in elementlerini 5 arttirip,
        // sonra yazdiran bir method olusuturun

        int [] arr= {3,5,6,5};



        elementleri5Arttir(arr);//[8, 10, 11, 10]
        elementleri5Arttir(arr);
        elementleri5Arttir(arr);

        System.out.println("method call'dan sonra main method icinde arr:"+Arrays.toString(arr));
    }
    public static void elementleri5Arttir(int [] arr){

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=arr[i]+5;

        }

        System.out.println(Arrays.toString(arr));
    }
}
