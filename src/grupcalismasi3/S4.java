package grupcalismasi3;

import java.util.Arrays;

public class S4 {
    public static void main(String[] args) {

        /*
         * Write a method that accepts an integer array as input and prints the minimum
         * and the maximum numbers from given array
         *
         * Input : {-1,3,2,5,4,1,6,-2}
         *
         * Output :
         *
         * min: -2
         *
         * max: 6
         */

        int[] arr = {-1, 3, 2, 5, 4, 1, 101, -10};

        arrayMinMaxDegerBulma(arr);

    }
    public static void arrayMinMaxDegerBulma (int [] arr){
        Arrays.sort(arr);

        System.out.println("min değer :" + arr[0] +
                "\nmax deger : " + arr[arr.length-1]);

    }
}
