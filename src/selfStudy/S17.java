package selfStudy;

import java.util.Scanner;

public class S17 {
    /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir işçinin iş'i bitme süresi nedir. gün sayisi olarak giriniz");
        int birIscininBitirmeSuresi= scan.nextInt();

        System.out.println("toplam işci sayisi nedir");
        int isciSayisi=scan.nextInt();

        int isBitmeSuresi=0;

        isBitmeSuresi=birIscininBitirmeSuresi/isciSayisi;

        System.out.println("is'in bitme suresi : "+isBitmeSuresi +" gundur.");


    }
}
