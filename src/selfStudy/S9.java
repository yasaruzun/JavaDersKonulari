package selfStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class S9 {

    /*
     * Kullanicidan int  list uzunlugunu isteyin
     * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
     * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
     *
     * n = 5 icin (listin uzunlugu);
     * input { 1 , 2 , 2 , 3 , 4}
     * output {2}
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen oluşturmak istediğiniz list'in uzunluğunu giriniz.");
        int uzunluk = scan.nextInt();
        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < uzunluk; i++) // Girilen uzunluk kadar dönecek.
        {
            System.out.println("Lütfen yeni bir değer giriniz. ");
            int girilensayi = scan.nextInt();
            sayilar.add(girilensayi);
        }

        TekrarliSayilariBul(sayilar);
    }
    public static void TekrarliSayilariBul(List<Integer> sayilar) {

        List<Integer> tekrarsizListe = new ArrayList<>();//sadece tekrar eden list'e eklenecek
        int sayac=0;

        for (int i = 0; i <sayilar.size() ; i++) {
            sayac=0;
            for (int j = i+1; j <sayilar.size() ; j++) {
                sayac=0;
                if(sayilar.get(i)!=sayilar.get(j)){
                    sayilar.remove(sayilar.get(i));
                }else{
                    tekrarsizListe.add(sayilar.get(i));
                    sayac++;


                }
            }

            }
        System.out.println(tekrarsizListe);
        }

        }



