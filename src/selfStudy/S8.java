package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S8 {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {

        int [] input1 ={1,2,3,4,5,6,7,8};
        int input2 = 3;


        List<Integer>sayilar = new ArrayList<>();

        Arrays.sort(input1);

        for (int i = 0; i <input1.length ; i++) {
            sayilar.add(input1[i]);
        }

        System.out.println(sayilar.subList(sayilar.size()-input2, sayilar.size()));
    }

}
