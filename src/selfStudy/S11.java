package selfStudy;

import java.util.Scanner;

public class S11 {

    /*
     * Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1.Adım- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2.Adım- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * 2. oyuncu Eger kelimeyi kabul ederse  1.oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve hangi  oyuncunun
     *        kazandigini yazip oyunu bitirin.
     *
     * 3.Adım- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //* 1.Adım- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
        System.out.println("1.oyuncu, lutfen bir kelime giriniz");
        String oyuncu1Kelime1 = scan.nextLine();
        //2.Adım- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
        System.out.println("2.oyuncu, 1.oyuncu'nun girdigi kelimeyi kabul ediyor musunuz ? (Evet/Hayir)");
        String oyuncu2Onayi =scan.nextLine();
        int birinciOyuncuPuan = 0;
        int ikinciOyuncuPuan=0;

        // 2. oyuncu Eger kelimeyi kabul ederse  1.oyuncuya kelimedeki harf sayisi kadar puan ekleyin

        if(oyuncu2Onayi.equalsIgnoreCase("evet")){

            birinciOyuncuPuan+=oyuncu1Kelime1.length();

            System.out.println(birinciOyuncuPuan);

        //  * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve hangi  oyuncunun
            //     *        kazandigini yazip oyunu bitirin.

        }else{
            System.out.println("geçersiz kelime"+
                                "\n kazanan oyuncu : 1.oyuncu");

        }
    //3.Adım- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun
        System.out.println("2.oyuncu devam etmek istiyor musun? evet/hayır");
        oyuncu2Onayi =scan.nextLine();

        //* devam etmek isterse kelimeye eklemek istedigi string'i ve
        //     *          basa mi sona mi ekleyecegini sorun
        //     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin

        if(oyuncu2Onayi.equalsIgnoreCase("evet")){
            System.out.println("lütfen eklemek istediğiniz kelimeyi giriniz");
            String Ekkelime=scan.nextLine();
            System.out.println("bu kelimeyi basa mı son'a mı eklemek istersiniz? basa/sona");
            String kelEklenecYer=scan.nextLine();
            if(kelEklenecYer.equalsIgnoreCase("basa")){
                oyuncu1Kelime1=Ekkelime+oyuncu1Kelime1;
            }else{
                oyuncu1Kelime1=oyuncu1Kelime1+Ekkelime;
            }
            //2.Adım- 2.oyuncu kelimeyi girince 1.oyuncuya kelimeyi kabul edip etmedigini sorun.
            //     *      * 1. oyuncu Eger kelimeyi kabul ederse  2.oyuncuya kelimedeki harf sayisi kadar puan ekleyin
            //     *        ve 3.adima gecin
            //     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve hangi  oyuncunun
            //     *        kazandigini yazip oyunu bitirin.

            System.out.println("1.oyuncu girilen kelimeyi kabul ediyor musunuz? evet/hayır");
            String ikinciOyuncuCevabi= scan.nextLine();
            if(ikinciOyuncuCevabi.equalsIgnoreCase("evet")){
                ikinciOyuncuPuan+=oyuncu1Kelime1.length();

            }else{
                System.out.println("geçersiz kelime"+
                        "\n kazanan oyuncu : 2.oyuncu");
            }

        }


    }
}
