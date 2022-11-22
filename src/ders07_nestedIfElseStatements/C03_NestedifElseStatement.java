package ders07_nestedIfElseStatements;

public class C03_NestedifElseStatement {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet= 'K';
        int yas = 56;

        //nested if-else şeklinde kullanım için önce ana değişkeni seçip
        //ona göre ana yapıyı oluşturalım
        //cinsiyete ana değişkenimiz olsun

        if(cinsiyet=='k' || cinsiyet=='K'){
            //giriş yapılan deger bir kadına aittir.
            if(yas<15){
                System.out.println("hatalı yas girişi");
            }else if(yas<60){
                System.out.println("emekli olamazsın, daha "+ (60-yas) + "yıl çalışmalısın");
            }else{
                System.out.println("emekli olabilirsin");
            }


        }else if(cinsiyet=='e' || cinsiyet=='E'){
            //giriş yapılan deger erkeğie aittir.

            if(yas<15){
                System.out.println("hatalı yas girişi");
            }else if(yas<65){
                System.out.println("emekli olamazsın, daha "+ (65-yas) + "yıl çalışmalısın");
            }else{
                System.out.println("emekli olabilirsin");
            }


        }else{
            System.out.println("yanlis cinsiyet girişi");
        }









    }
}
