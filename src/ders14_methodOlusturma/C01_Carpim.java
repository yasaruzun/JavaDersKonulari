package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

        //main method içerisinde kullanıcıdan 2 sayı alın
    // bu iki sayıyı parametre olarak kabul edip,çarpımlarını main method a döndüren bir method olusturun


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 2 sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println(carpimMethodu(sayi1,sayi2));//1.yöntem. yazdıracak
        double carpimSonucu=carpimMethodu(6,2);//2. yöntem - bu yazdırmaz. 2 defa çarpım methodu çalıştı yazmasının nedeni 2.buradan dolayı


    }

    //olusturqacagımız method main methodun dısında olur

    public static double carpimMethodu(double sayi1 , double sayi2){
        System.out.println("çarpım methodu çalıştı");

        return sayi1*sayi2;


    }




}
