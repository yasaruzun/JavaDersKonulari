package ders15_methodOverLoading_WhileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.


        int sayi=3;
        int üs=4;


        üsHesaplaMethodu(sayi,üs);

    }
    public static void üsHesaplaMethodu(int sayi, int üs){
        int sonuc=1;
        while (üs>0){
            sonuc *=sayi;
            üs--;
        }
        System.out.println(sonuc);
    }


}

