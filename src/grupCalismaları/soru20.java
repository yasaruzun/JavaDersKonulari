package grupCalismaları;

import java.util.Scanner;

public class soru20 {
    public static void main(String[] args) {


        ///*
        //Kullanicidan bir kelime girmesini isteyin.
        //* Sozcuk tek sayida karaktere sahip olacak ve en az 3 karaktere sahip olacak
        //* kelimenin ortasindaki karakteri yazdirin.
        //*/

        Scanner scan= new Scanner(System.in);


        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.nextLine();

        if(kelime.length()>=3 && kelime.length()%2!=0) {

            System.out.println(kelime.substring(kelime.length() / 2, kelime.length() / 2 + 1));

        }else{
            System.out.println("kelime sitenilen şartları sağlamamaktadır");
        }






    }
}
