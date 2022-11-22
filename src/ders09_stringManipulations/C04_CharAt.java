package ders09_stringManipulations;

public class C04_CharAt {
    public static void main(String[] args) {

        String str="Java Candır";

        System.out.println(str.charAt(0));// ilk harfi verir-J

        System.out.println(str.charAt(5));//C -- 0'dan başlıyor indexler

        System.out.println(str.charAt(10));//bana sonunda(r) karateri yazdırın

        /*
        bir metindeki karakter sayısı ile son index arasında 1 fark vardır.
        bu metin için karater sayısı 11, index sayısı 10'dur.

         */

        System.out.println(str.charAt(11));//hata verir








    }
}
