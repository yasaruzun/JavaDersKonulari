package ders06_IfelseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 1 harf giriniz");

        char harf= scan.next().charAt(0);

        if(harf>='a'&& harf<='z'){
            //kucuk harf girildi demektir ascı tablosuyan gore yazıldı 32
            System.out.println((char)(harf-32));

        }else{
            //kucuk harf degil demektir.
            System.out.println(harf);
        }






    }
}
