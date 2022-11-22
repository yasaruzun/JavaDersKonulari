package ders35_exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundsExceptions {
    public static void main(String[] args) {

        /*
            Kullanicidan bir index isteyin
           verilen bir array'den  kullanici'nin girdigi index'deki elementi yazdirin
         */


        int[] arr={3,4,5,6,7,8,9,0,3};

        Scanner scan=new Scanner(System.in);
        System.out.println("yazdirmak istediginiz elemanin index'ini giriniz");
        int index=scan.nextInt();


        try {
            System.out.println(arr[index]);

        } catch (ArrayIndexOutOfBoundsException hata) {

            //System.out.println(hata.getMessage());//Index 9 out of bounds for length 9
            //hata.printStackTrace();/// java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
            //at ders35_exceptions.C03_ArrayIndexOutOfBoundsExceptions.main(C03_ArrayIndexOutOfBoundsExceptions.java:23)

            //Process finished with exit code 0

            // exception verdi ama kod calismaya devam etti.

            //catch blogunda hicbir kod olmasa da kodlarimiz normal calismaya devam eder
            //catch blogunda kullaniciya yazdiracagimiz mesaj
            //tamamen kod yazanin insiyatifindedir.
            //exception class'indan hazir hata mesajlari da yazdirabilir
            //kendi istedigi kodlari da calistirabilir
            //hic bir sey yazmaya da bilir.

        }

    }
}
