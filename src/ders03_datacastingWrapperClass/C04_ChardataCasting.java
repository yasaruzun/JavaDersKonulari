package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C04_ChardataCasting {
    public static void main(String[] args) {


        System.out.println('a'+'b'); //97+98 =195

        //kullanicidan char bir karakter alin
        // o karakterden sonra 3 karateri yazdirin
        // örnek input : a, output bcd olsun


        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char girilenKrk=scan.next().charAt(0); // kullanici " Ali" girerse her birinin indexi var 0,1,2 şeklinde

        System.out.println(""+(char)(girilenKrk+1)+ (char)(girilenKrk+2)+(char)(girilenKrk+3));





    }
}
