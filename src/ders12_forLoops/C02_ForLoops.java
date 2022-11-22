package ders12_forLoops;

import java.sql.SQLOutput;

public class C02_ForLoops {
    public static void main(String[] args) {

        for (int i = 0; i <=10; i++) {
            System.out.print(i+" ");//0 1 2 3 4 5 6 7 8 9 10, ln olunca altalta yazar, ln i çıkarırsak yan yana yazar
        }

        System.out.println(" "); //BURA ÖNEMLİ 2 YAZILAN İÇİN
        //2 basamaklı sayılardan 7 ile bölünebilenleri yan yana yazdırın

        for (int i = 10; i <=99 ; i++) {

            if(i%7==0) System.out.print(i+" ");

        }

        System.out.println(" ");

        //13'te başlayarıp, 100'e kadar 7'şer 7'şer arttrıp yazdıralım

        for (int i = 13; i <=100 ; i+=7) {
            System.out.print(i+" ");

        }

        System.out.println(" ");

        //1'den 10'a kadar sınırlar dahil sayıların karelerini yazdıralım

        for (int i = 1; i <=10 ; i++) {

            System.out.print(i*i+" ");

        }

        System.out.println(" ");





    }
}
