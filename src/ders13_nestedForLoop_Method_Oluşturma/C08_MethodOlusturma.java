package ders13_nestedForLoop_Method_Oluşturma;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {


        /*

        kullacnıdan 2 sayı alıp, bunların toplamını yazdıran bir method olusturun
         */

    isteToplyaYazdir();


    }

    public static void isteToplyaYazdir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 2 sayı giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("girilen sayların toplamı :"+(sayi1+sayi2));
    }





}
