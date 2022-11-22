package ders29_stringBuilder_accessModifier;

public class   C02_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1=new StringBuilder("Java candir");

        System.out.println(sb1.reverse());//ridnac avaJ

        System.out.println("tersini yazdirdikdan sonra sb1 :" +sb1);

        System.out.println(sb1.insert(0, "."));//.ridnac avaJ

        System.out.println(sb1);//.ridnac avaJ

        sb1.reverse();

        StringBuilder sb2=new StringBuilder("Java candir.");

        String str="Java candir.";

        System.out.println(sb1==sb2);//false-- icerik ayni olmas bile false verir

        System.out.println(sb1==sb1);//true     ancak sadece bir sb kendisi ile karsilasitirlirsa true verir

       // System.out.println(sb1==str); farkli iki data turu == ile karsilastirilamaz


        System.out.println(sb1.equals(sb2));//false   icerik ayni olmas bile false verir

        System.out.println(sb1.equals(sb1));//true ancak sadece bir sb kendisi ile karsilasitirlirsa true verir

        System.out.println(sb1.equals(str));//false CTE vermez ,fakat sonuc her zaman false'dur

        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("Tava candir");

        System.out.println(sb1.compareTo(sb3));//-10

        //compareTo sadece ayni mi yoksa farkli mi sorusununun cevabini verir
        //tamamen ayni ise ==>0 doner,
        //farklilik varsa o zaman ==> ilk farkli harf buldugunda farkli harflerin arasinda kac harf oldugunu verir
    }
}
