package selfStudy;

import java.util.Scanner;

public class S12 {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

    public static void main(String[] args) {

        double mesafe=400;
        double ortHiz=100;

        double sureH=0;

        sureH=mesafe/ortHiz;

        System.out.println(sureH);




    }
}
