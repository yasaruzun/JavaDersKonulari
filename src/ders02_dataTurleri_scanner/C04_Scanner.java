package ders02_dataTurleri_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        //Kullanıcıdan ismini alıp buyuk harfler ıle yazdirin
        //1.adim scan objesi oluşturmak

        Scanner scan = new Scanner(System.in);


        //2.adim kullaniciya ne istedigimizi yazdirmak
        System.out.println("Lutfen adinizi giriniz");

        //3.adim kullanıcıdan istediğimiz bilginin türüne uygun bir variable olusturup
        //scanner metodlarından uygun olanını kullanarak alınan degeri variable ile atayalım.
        String kullaniciAdi= scan.next();

        System.out.println(kullaniciAdi.toUpperCase(Locale.ROOT));
    }
}
