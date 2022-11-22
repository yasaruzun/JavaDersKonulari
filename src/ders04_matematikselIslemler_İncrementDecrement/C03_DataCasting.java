package ders04_matematikselIslemler_İncrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

            //kullanicidan 2 int deger alip , bunları birbirine bölün ve sonucu double olara yazidirin


            Scanner scan= new Scanner(System.in);

            System.out.println("lutfen 2 tamsayi giriniz");


            int sayi1 = scan.nextInt();
            int sayi2= scan.nextInt();


            double bolmeSonucuondalik=(double)(sayi1/sayi2);

            System.out.println(bolmeSonucuondalik); //3.0


            double dogruSonuc = (double)sayi1/sayi2; // double/int==> genis olana  gore sonuc verir

            System.out.println(dogruSonuc);







    }
}
