package ders44_maps;

import java.util.*;

public class MapDepo {

    //ogrenci map olusturup bıze donduren bir method olusturun

    public static Map<Integer, String> ornekMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();


        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali-Cem-11-H-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Ayse-Cem-11-M-TM");
        ogrenciMap.put(106, "Fatma-Han-10-K-Soz");

        return ogrenciMap;
    }

    public static String isimSoyIsimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {


        String ogrencValue = ogrenciMap.get(ogrenciKey);// Ayse-Cem-11-M-TM,

        String[] valueArr = ogrencValue.split("-");// [Ayse,Cem,11,M,TM]

        String isimSoyisim = valueArr[0] + " " + valueArr[1];//Ayse Cem

        return isimSoyisim;
    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey, String yeniSube) {


        // ogrenci key map'de var mi ? 104

        if (ogrenciMap.containsKey(ogrenciKey)) {
            // istenen Key varsa, update edip yeni map'i dondurecegiz

            String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey); // Ayse-Can-10-H-MF
            String[] istenenKeyvalueArr = istenenKeyinValuesu.split("-"); // [Ayse, Can, 10, H , MF]
            // yeni sube degerini atayalim
            istenenKeyvalueArr[3] = yeniSube; // // [Ayse, Can, 10, K , MF]

            String istenenKeyinYeniValesu = istenenKeyvalueArr[0] + "-" +
                    istenenKeyvalueArr[1] + "-" +
                    istenenKeyvalueArr[2] + "-" +
                    istenenKeyvalueArr[3] + "-" +
                    istenenKeyvalueArr[4];

            ogrenciMap.put(ogrenciKey, istenenKeyinYeniValesu);
        }

        return ogrenciMap;
    }

    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {

       Collection<String> valueColleciton =ogrenciMap.values();
  /*
        [Ali-Can-10-H-MF,
        Veli-Cem-11-M-Soz,
        Ali-Cem-11-H-TM,
        Ayse-Can-10-H-MF,
        Ayse-Cem-11-M-TM,
        Fatma-Han-10-K-Soz]
         */


        System.out.println("isim     soyisim        sinif");
        System.out.println("==============================");
        for (String eachValue:valueColleciton
             ) {
            //value'yu parcalarin ayir,
            String [] valueArr= eachValue.split("-"); //[Ali,Can,10,H,MF]

            // sube ismini kontrol et, istenen sube ise isim soyisim, sinif yazdir

            if(valueArr[3].equals(subeAdi)){
                System.out.println(valueArr[0]+" "+ valueArr[1]+" "+valueArr[2]);
            }

        }


    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {

        //hem key hem de value lazim oldugundan keySet'i olusturduk
        //sonra o key uzerinden value'yu map'den aldik

       Set<Integer>ogrenciKeySeti= ogrenciMap.keySet();

       //dondureceğimiz listeyi olusturalim
        List<String> isimListesi=new ArrayList<>();

        //Key degerlerini tek elden gecirip
        //istenen aralikta olanlari bulalim


        String value;
        String [] valueArr;
        String istenenIsim;

        for (Integer eachKey: ogrenciKeySeti
             ) {
            if(basNo<=eachKey && eachKey<=bitNo){
                //buraya verilen sinir degerlerine uyan
                //eachKey'ler gelecek

                // sinira uygun key'in value'sini alalım
                value=ogrenciMap.get(eachKey);//[Ayse-Can-10-H-MF]

                //value parcalara ayiralim
                valueArr=value.split("-");//[Ayse,Can,10,H,MF]

                //value arrayinden listeye eklenecek bilgileri alalim
                istenenIsim=valueArr[0]+" "+valueArr[1]+" "+valueArr[4];

                //istenen ismi olusturduk, bunu listeye ekleyelim
                isimListesi.add(istenenIsim);

            }
        }

    return isimListesi;
    }

    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMap) {

        Set<Integer>keySeti= ogrenciMap.keySet();
        String value;
        String[] valueArr;

        for (Integer eachKey:keySeti
             ) {
           value= ogrenciMap.get(eachKey);

           valueArr=value.split("-");


            System.out.println(eachKey+" "+valueArr[0]+" "+valueArr[1]);

        }



    }

    public static Set<String> siraliOgrenciListesiOlustur(Map<Integer, String> ogrenciMap) {

        Set<String>siraliOgrenciSeti=new TreeSet<>();

        //tum elementlerin key ve value'lerine birlikte ihtiac oldugundan entry kullanmaliyiz

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMap.entrySet();

        //her bir entry'i elden gecirip, bilgileri istedigimiz formatta alalim


        String istenenBilgi;
        String value;
        String[] valueArr;

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti
             ) {
            //101=Ali-Can-10-H-MF- Entry
            // bolum,sinif, sube,isim, soyisim ve numara'larini yazdirin

            value=eachEntry.getValue();

            valueArr=value.split("-");//[Ali,Can,10,H,MF]

            istenenBilgi=valueArr[4]+", "+
                         valueArr[2]+", "+
                         valueArr[3]+", "+
                         valueArr[0]+" "+
                         valueArr[1]+", "+
                         eachEntry.getKey();

            siraliOgrenciSeti.add(istenenBilgi);


            //map'de herhangi bir degisiklik istenmediginden
            //array'i yeniden birlestirip entry.setValue() yapmamiza gerek yok
        }






        return siraliOgrenciSeti;
    }


    public static Map<Integer, String> soyIsimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        //soyisimleri buyutmek icin once EntrySet alalim
        //entrySet'deki her bir entry'deki value alalim
        //value'yu split yapip, arraya cevirelim
        //array'de istedigimiz degisikligi yapalim
        //array'deki yeni bilgileri birlestirip eachEntry'deki SetValue deyip yeni degeri yazalim


        String value;
        String []valueArr;


        Set<Map.Entry<Integer,String>> ogrenciEntrySeti= ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {

            value=eachEntry.getValue();
            valueArr=value.split("-");

            valueArr[1]=valueArr[1].toUpperCase();


            eachEntry.setValue(valueArr[0]+"-"+
                    valueArr[1]+"-"+
                    valueArr[2]+"-"+
                    valueArr[3]+"-"+
                    valueArr[4]);

        }





        return ogrenciMap;
    }
}