package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatement {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.



        //nested if-else şeklinde kullanım için önce ana değişkeni seçip
        //ona göre ana yapıyı oluşturalım
        // yas ana değişkenimiz olsun

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("lutfen cinsiyeti giriniz E/K");
        char cinsiyet= scan.next().charAt(0);

        if(yas<15){
            System.out.println("hatalı yaş girişi");

        }   else if (yas<60){
            //emekli olamaz,çalışması gereken süre cinsiyete bağlı
            System.out.println("emekli olamazsın");
            if(cinsiyet=='K' || cinsiyet=='k'){
                System.out.println("daha"+ (60-yas)+ "sene çalışmalısın");
            }else if(cinsiyet=='E' || cinsiyet== 'e'){
                System.out.println("daha"+ (65-yas)+ "sene çalışmalısın");
            }else{
                System.out.println("hatali cinsiyet girişi");
            }


        }else if (yas<65){
            //kadın ise emekli olabilir, erkek çalışması lazım
            if(cinsiyet=='K'|| cinsiyet=='k'){
                System.out.println("emekli olabilirisin");
            }else if(cinsiyet=='E' || cinsiyet=='e'){
                System.out.println("emekli olmak için "+ (65-yas)+"yıl daha çalışmalısın");
            }else{
                System.out.println("hatalı cinsiyet girişi");
            }


        }else{//yas 65 ten büyükse
            System.out.println("emekli olabilisin");
        }






    }
}
