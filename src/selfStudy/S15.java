package selfStudy;

import java.util.Scanner;

public class S15 {
    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

    public static void main(String[] args) {
        double sonuc=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 3 sayi giriniz");
        double a= scan.nextInt();
        double b= scan.nextInt();
        double c= scan.nextInt();


        sonuc=((a*a)-(b*b))/(c*3);

        System.out.println(sonuc);

    }
}
