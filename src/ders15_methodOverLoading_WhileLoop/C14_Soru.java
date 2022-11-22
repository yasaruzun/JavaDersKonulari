package ders15_methodOverLoading_WhileLoop;

import java.util.Scanner;

public class C14_Soru {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        // Kullaniciya bitirmek
        //istediginde 0'a basmasini soyleyin
        //Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        //bunlarin toplaminin kac oldugunu yazdirin
        //Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        //negatif sayiyi sayi adedine ve toplama eklemeyin

        Scanner scan=new Scanner(System.in);
        int tamSayi=12;
        int genelToplam=0;
        int sayac=0;


        while(tamSayi!=0){
            System.out.println("lütfen bir tamsayi giriniz"+"\nbitirmek istediğiniz lütfen 0'a basınız");
            tamSayi=scan.nextInt();
            genelToplam+=tamSayi;
            sayac++;

            if(tamSayi<0){
                System.out.println("negatif sayi kullanamazsiniz");
                sayac--;
                genelToplam-=tamSayi;


            }
            if(tamSayi==0){
                System.out.println("toplamı  "+genelToplam+ " olan "+sayac+" adet tamsayi girilmiştir");

            }

        }


    }
}
