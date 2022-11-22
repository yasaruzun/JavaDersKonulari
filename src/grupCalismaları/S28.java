package grupCalismaları;

public class S28 {
    public static void main(String[] args) {

//Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
//Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
//isim bosluk soyisim seklinde bize donduren bir method olusturun
//input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz


        String isim="yasar";
        String soyIsim="uzun";

        System.out.println(isimSoyIsimIlkHarfBuyukDigerleriKucuk(isim, soyIsim));

    }
    public static String isimSoyIsimIlkHarfBuyukDigerleriKucuk(String isim,String soyisim){

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        String output= isim+" "+soyisim;

        return output;
    }
}
