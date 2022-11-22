package ders15_methodOverLoading_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan toplanmak üzere tamsayılar alın
        //kullanıcı 0'a basarsa sayı alma işlemini bitirin

        //kullanıcının kaç sayı girdiğini ve bu sayıların toplamının kaç oldğunu yazdırın


        Scanner scan= new Scanner(System.in);
        int girilenSayi=5;//verilen ilk değer bu soru için 0 olmamalı, çünkü 0 loop'u bitiemek için kullanılacak

        int sayac=0;
        int toplam=0;



        while (girilenSayi!=0){

            System.out.println("lütfen bir tamsayı giriniz"+"\nbitirmek için 0'a basın");
            girilenSayi= scan.nextInt();

            if(girilenSayi!=0){
                sayac++;
                toplam+=girilenSayi;

            }
        }
        System.out.println("girilen"+" " +sayac+" "+ "adet sayının toplamı:"+toplam);




    }
}
