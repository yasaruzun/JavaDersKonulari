package ders08_ternary_switch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        //J:Java
        //D:Devolepment
        //K:Kit

        //kullanıcıdan bir harf alın , alınan harf J, D, K'dan biri ise yukarıdaki kelimeleri yazdırın
        //bu harflerden biri değilse geçersiz har yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);


        switch (harf){
            case 'J' :
            case'j':
                System.out.println("Java");
                break;
            case 'D' :
            case 'd':
                System.out.println("development");
                break;
            case 'K':
            case'k':
                System.out.println("kit");
                break;
            default:
                System.out.println("geçersiz harf");


        }














    }
}
