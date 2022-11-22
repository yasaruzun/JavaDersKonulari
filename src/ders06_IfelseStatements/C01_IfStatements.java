package ders06_IfelseStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ay isminin ilk harfini girin");

        char ilkHarf = scan.next().charAt(0);


        if (ilkHarf == 'o' || ilkHarf == '0') {
            System.out.println("ocak");
        }

        if (ilkHarf == 's' || ilkHarf == 'S') {
            System.out.println("Subat");
        }

        if (ilkHarf == 'm' || ilkHarf == 'M') {
            System.out.println("Mart veya Mayıs");
        }

        if (ilkHarf == 'n' || ilkHarf == 'N') {
            System.out.println("Nisan");
        }

        if (ilkHarf == 'h' || ilkHarf == 'H') {
            System.out.println("Haziran");
        }







    }
}
