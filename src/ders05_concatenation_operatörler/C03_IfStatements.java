package ders05_concatenation_operatörler;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        //kullanicidan 2 sayi alın
        //eger birinci sayi 100'den büyükse, "ilk sayi 100'den büyük" yazdirin
        //eger ikinci sayi cift ise , " ikinci sayi cift" yazdirin
        //eger ilk sayi ikinci sayidan büyükse , "ilk sayi daha büyük" yazdirin


        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen 2 tamsayi giriniz");

        int s1= scan.nextInt();
        int s2= scan.nextInt();


        if(s1>100) {
            System.out.println("ilk sayi 100'den büyük");}

        if (s2%2==0){
            System.out.println("ikinci sayi çift ");}

        if (s1>s2){
            System.out.println("ilk sayi daha büyük");}











    }
}
