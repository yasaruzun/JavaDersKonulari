package ders33_inheritanceDataTypeKullanimi_overriding;

public class Corolla extends BToyota {

    String model="Corolla";
    String uretimYeri="Türkiye";
    int yil=2023;

    public static void main(String[] args) {
        /*
        bir obje olusturulurken
        data turu ve contructor ayni class'dan ise
        bir VARIABLE'in degerini bulmak icin o class'a gideriz.
        o class'da yoksa sirasi ile parent class'lara bakilir
        ilk bulunan kullanilir
         */

        Corolla corolla1=new Corolla();

        System.out.println(corolla1.model);// Cororlla classi
        System.out.println(corolla1.uretimYeri);//Corolla classi
        System.out.println(corolla1.yil);//Corolla class'i
        System.out.println(corolla1.marka);//BToyota class i
        System.out.println(corolla1.motor);//Araba class i
        System.out.println(corolla1.plaka);//Araba Class i
        System.out.println(corolla1.yakit);//BToyota class'i


        BToyota corolla2= new Corolla();

        /*
        obje olusturulurken data turu ve contructor farkli ise
        VARIABLE'in degerini bulmak icin data turu olan class'a gidilir
        varsa l-kulllanilir, yoksa o class'in parentlarina bakilir
        bulunamazsa CTE verir
        (ama geri vites yapmaz)
         */

        System.out.println(corolla2.model);// BToyota classi
        //System.out.println(corolla2.uretimYeri);// CTE
        System.out.println(corolla2.yil);//BToyota class'i
        System.out.println(corolla2.marka);//BToyota class i
        System.out.println(corolla2.motor);//Araba class i
        System.out.println(corolla2.plaka);//Araba Class i
        System.out.println(corolla2.yakit);//BToyota class'i


        Araba corolla3= new Corolla();





        //System.out.println(corolla3.model);//CTE
        //System.out.println(corolla3.uretimYeri);//CTE
        //System.out.println(corolla3.yil);//CTE
        //System.out.println(corolla3.marka);//CTE
        System.out.println(corolla3.motor);//Araba class i
        System.out.println(corolla3.plaka);//Araba Class i
        System.out.println(corolla3.yakit);//Araba class'i


        BToyota toyota1=new BToyota();
        System.out.println(toyota1.marka);//BToyota
        System.out.println(toyota1.model);//BToyota
        System.out.println(toyota1.motor);//Araba
        System.out.println(toyota1.plaka);//Araba
        System.out.println(toyota1.yil);//BToyota
        System.out.println(toyota1.yakit);//BToyota



        Araba toyota2=new BToyota();
        //System.out.println(toyota2.marka);//CTE
        //System.out.println(toyota2.model);//CTE
        System.out.println(toyota2.motor);//Araba
        System.out.println(toyota2.plaka);//Araba
        //System.out.println(toyota2.yil);//CTE
        System.out.println(toyota2.yakit);//Araba

        Araba araba=new Araba();
        System.out.println(araba.motor);//Araba
        System.out.println(araba.plaka);//Araba
        System.out.println(araba.yakit);//Araba


    }

}
