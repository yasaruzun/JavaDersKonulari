package grupcalismasi3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S1 {
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

    public static void minMaxDegerBulma(int[] arr) {

        Arrays.sort(arr);

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }

        System.out.println(sayilar);//[-6, -1, 1, 2, 3, 4, 5, 100]

        System.out.println("min deger :" + sayilar.get(0) +
                            "\nmax deger :" + sayilar.get(sayilar.size() - 1));


    }


}

