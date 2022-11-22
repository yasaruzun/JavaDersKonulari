package grupcalismasi3;

import java.util.Arrays;

public class S1deneme {
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

        int[] arr = {-1, 3, 2, 5, 4, 1, 100, -6};
        minMaxDegerBulma(arr);
    }
    public static void minMaxDegerBulma (int[] arr){

        Arrays.sort(arr);
        System.out.println("min deger :"+arr[0]+"" +
                            "\nmax deger :"+arr[arr.length-1]);

    }
}
