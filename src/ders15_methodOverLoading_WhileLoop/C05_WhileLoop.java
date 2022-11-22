package ders15_methodOverLoading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan toplanmak üzere sayı alın, sayıların toplamı 500'e eşit olur veya geçerse
        //girilen sayı adedi
        //girilen sayıların toplamını ve

        //"bu kadar yeter" yazdırın

        Scanner scan=new Scanner(System.in);
        double girilenSayi= 0;
        double toplam=0;
        int sayac=0;




        while(toplam<=500){

            System.out.println("toplanmak için sayı giriniz");
            girilenSayi= scan.nextDouble();
            toplam+=girilenSayi;
            sayac++;

        }
        System.out.println("girilen " +sayac+ " sayının toplamı:  "+toplam+" oldu. Bu kadar yeter");





















    }
}
