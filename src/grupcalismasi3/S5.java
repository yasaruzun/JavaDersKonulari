package grupcalismasi3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S5 {
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

        Arrays.sort(arr);

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);//[-10, -1, 1, 2, 3, 4, 5, 101]

        System.out.println("min değer : "+sayilar.get(0)+
                            "\nmax değer : "+sayilar.get(sayilar.size()-1));






    }
}
