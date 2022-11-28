package ders45_maps;

import ders44_maps.MapDepo;

import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        //Ogrenci Map'inden numara, isim ve soyisim degelerini yazidralim

        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);
        /*
        101 Ali Can
        102 Veli Cem
        103 Ali Cem
        104 Ayse Can
        105 Ayse Cem
        106 Fatma Han
         */



    }

}
