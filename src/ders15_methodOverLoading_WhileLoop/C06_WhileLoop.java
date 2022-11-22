package ders15_methodOverLoading_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        //Soru : Kullanicidan Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        // kullanicinin yeni sifre girmesi isteyin
        // Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
        //sartlar :
        // - sifrenin ilk karakteri kucuk harf olmali
        // - sifrenin son karakteri sayi olmali


        Scanner scan=new Scanner(System.in);
        String sifre= "";
        boolean sifreGecerliMi=false;
        int bayrak=0;


        while (sifreGecerliMi!=true){
            System.out.println("lütfen şifrenizi giriniz");
            sifre= scan.nextLine();
            bayrak=0;

            if(!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
                System.out.println("şifrenin ilk karakteri küçük harf olmalı");
                bayrak++;
                }
            if(!(sifre.charAt(sifre.length()-1)>='0'&& sifre.charAt(sifre.length()-1)<='9')){
                System.out.println("şifrenin son karakteri sayı olmalı");
                bayrak++;

            }

            if(bayrak==0){
                sifreGecerliMi=true;
                System.out.println("şifreniz başarı ile kaydedildi");
            }

        }
    }
}
