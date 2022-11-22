package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotSayisi {
    public static void main(String[] args) {

        //ogretmenden ogrenci notlarini alip bir List olusturun
        //ogretmen 100 den buyuk bir sayi girip bitirdiginde
        // sinif sayisini,sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin


        List<Double> notlar=listeOlustur();

        System.out.println(notlar);

        raporla(notlar);



    }

    public static void raporla(List<Double> notlar) {

        int ogrenciSayisi=notlar.size();
        double notlarToplami=0.0;
        double SinifNotOrt=0.0;
        int ortalamaUstundekiOgrenciSayici=0;

        //notlar toplamini bulalım
        for (int i = 0; i <notlar.size() ; i++) {

            notlarToplami+=notlar.get(i);


        }
        //not ortalamasini bulalım

        SinifNotOrt=notlarToplami/ogrenciSayisi;

        //ortalama ustundeki ogrenci sayisini bulalım

        for (int i = 0; i <notlar.size() ; i++) {

            if(notlar.get(i)>SinifNotOrt){
                ortalamaUstundekiOgrenciSayici++;
            }
        }
        //rapor icin istenenleri yazdiralim
        System.out.println("girilen not sayisi :" + ogrenciSayisi+
                           "\ngirilen notlarin ortalamasi :" + SinifNotOrt+
                          "\nOrtalama uzerinde not alan ogrenci sayisi : "+ortalamaUstundekiOgrenciSayici);

    }

    public static List<Double> listeOlustur(){

        List<Double> notlar= new ArrayList<>();

        Scanner scan=new Scanner(System.in);

        Double girilenNot =5.0;

        while(girilenNot<=100){

            System.out.println("lütfen listeye eklemek icin not giriniz"+
                    "\nbitirmek icin 100' den buyuk bir sayi giriniz");

            girilenNot=scan.nextDouble();

            if(girilenNot<=100){
                notlar.add(girilenNot);
            }
        }

        return notlar;
    }
}
