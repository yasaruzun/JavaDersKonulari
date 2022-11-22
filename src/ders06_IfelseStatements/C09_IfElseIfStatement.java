package ders06_IfelseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatement {
    public static void main(String[] args) {

        //kullanididan bir tamsayi alın
        //sayi negatifse  "geçersiz sayi"
        // tek basamakli ise "rakam"
        // iki basamakli ise"iki basamakli sayi"
        //bunun dışındaki sayılar için "büyük sayı" yazdırsın


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if(sayi<0){
            System.out.println("geçersiz sayi");}
        else if(sayi<10){
            System.out.println("rakam");
        }else if(sayi<100){
            System.out.println("iki basamakli sayi");
        }else{
            System.out.println("buyuk sayi");
        }









    }
}
