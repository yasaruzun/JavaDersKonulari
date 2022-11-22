package ders05_concatenation_operatörler;

public class C01_Concatenation {
    public static void main(String[] args) {


        //sadece asagida verilen variable'rı kullnarak istenen degerleri yazdiralim


        String s1= "java";

        String s2= "güzeldir";

        String s3= "";//hiclik, string özelligi kazandiriyor

        String s4= " ";//space


        int sayi1= 4;

        int sayi2= 3;

        // java Güzeldir7

        System.out.println(s1+s4+s2+(sayi1+sayi2)); //  sayilar int oldugu icin matematiksel toplama olsun diye () icine aldık

        //java Guzeldir 12

        System.out.println(s1+s4+s2+s4+(sayi1*sayi2));//sayiları paraztez icie almasak da calısır cuku toplamalara kıyaslamalara ıslem oncelıgı vardir

        //7Java Guzeldir

        System.out.println(sayi1+sayi2+s1+s4+s2);

        //34 Java

        System.out.println(s3+sayi2+sayi1+s4+s1);

        //java7 güzeldir43

        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);












    }
}
