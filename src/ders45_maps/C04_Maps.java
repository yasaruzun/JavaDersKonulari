package ders45_maps;

import ders44_maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {
        /*
        ogrenci map'inde numarasi verilen sayilarin arasinda (sinirlar dahil) olan ogrencilerin
         isim soyisim ve bolumlerini List olarak bize donduren bir method olusturun
         */


        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();


        int basNo=102;
        int bitNo=103;
        List<String> isimListesi=MapDepo.numaraDegerineGoreListeOlustur(ogrenciMap,basNo,bitNo);

        System.out.println(isimListesi);//[Veli Cem Soz, Ali Cem TM]
    }
}
