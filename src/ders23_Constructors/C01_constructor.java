package ders23_Constructors;

import java.util.Scanner;

public class C01_constructor {
    public static void main(String[] args) {


        //scanner clasindeki method ve variable ları(ozellikleri) kullanmak icin scan objesi olusturur
        Scanner        scan                     =new                    Scanner(System.in);
        //class adi    obje ismi     obje olusturmak icin keyword       Scanner Constructor

        scan.nextInt();

        String str=new String("java candir");
        String str2="java ne güzel";

        str.toLowerCase();


        //method isimleri kucuk harfle baslar
        //class ismi ile ayni isimde olmaması tercih edilir.

        //return type varsa(void vb) methoddur.constructor olamaz.
        //construktor ile class ismi aynı olmalı






    }
}
