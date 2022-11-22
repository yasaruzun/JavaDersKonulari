package ders04_matematikselIslemler_İncrementDecrement;

import java.util.Scanner;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        //Kullanicinin girdigi 4 basamakli bir sayinin rakamlar toplamini veren bir kod yaziniz

        //GRUBA GONDERILEN FOTOYA BAK DAHA IYI ANLAMAK ICIN


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        int input= scan.nextInt();


        int birlerBasamagi;
        int rakamlarToplami=0;


        // 1- birler basamagini al
        birlerBasamagi= input%10; // 3

        //2-birler basamagini rakamlar toplamina ekle
        rakamlarToplami= rakamlarToplami+birlerBasamagi; // 0+3

        //3- birler basamagindan kurtul
        input = input/10;




        birlerBasamagi= input%10;


        rakamlarToplami= rakamlarToplami+birlerBasamagi;


        input = input/10;



        birlerBasamagi= input%10;


        rakamlarToplami= rakamlarToplami+birlerBasamagi;


        input = input/10;



        birlerBasamagi= input%10;


        rakamlarToplami= rakamlarToplami+birlerBasamagi;


        input = input/10;


        System.out.println("verilen sayinin rakamlar toplami:"+rakamlarToplami);







    }
}
