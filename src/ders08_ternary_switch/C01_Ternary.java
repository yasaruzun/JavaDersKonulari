package ders08_ternary_switch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan bir sayi alın
        //sayı pozitif ise 2 katını yazdırın
        //sayi pozitif değilse sayıya 10 ekleyip yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();


        if(sayi>0){
            System.out.println(sayi*2);
        }else{
            System.out.println(sayi+10);
        }

        System.out.println(sayi>0 ? 2*sayi: sayi+10);














    }
}
