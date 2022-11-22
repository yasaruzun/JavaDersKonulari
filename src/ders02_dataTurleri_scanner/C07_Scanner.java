package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {


        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");
        String isminiz= scan.nextLine();
        //string icin kullanılabilen next() sadece ilk space'a kada rolan kismi alir. nextline() ise birden fazla kelimeyi alabilir

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        System.out.println("\nisminiz:"+ isminiz  +"\nsoyisminiz :"+soyisim +"\nyasiniz: "+yas+ "\nKaydiniz basariyla tamamlanmistir" );


    }
}
