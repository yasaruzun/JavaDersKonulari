package grupCalismaları;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        //oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        //yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        //tek
        if(sayi%2!=0){
            if(sayi>0){
                System.out.println("pozitif tek sayı");
            }else{
                System.out.println("negatif tek sayi");
            }
        }else if(sayi%2==0){//çift

            if(sayi%10==0){
                System.out.println("10'un tam katidir");
            }else{
                System.out.println("10'nun tam kati degildir");
            }


        }




    }
}
