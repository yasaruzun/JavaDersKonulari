package ders14_methodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //bu iki sayının çarpım sonucunu yeni kod yazmadan konsola yazırın

        System.out.println(C01_Carpim.carpimMethodu(a, b));

        String c="nasıl";
        String d="yani";
        // bu iki string i aralarında boşluk bırakarak yazdırın

        System.out.println(C02_StringConcat.birlestirMethodu(c, d));//nasıl yani

        String e= "bu da mı oldu?";
        // e string'ini tersten yazdırın

        System.out.println(C03_StringTerseCevirme.tersCevirmeMethodu(e));

        //bu cümleyi terse çevirin

        System.out.println(C03_StringTerseCevirme.tersCevirmeMethodu("bu cümleyi terse çevirin"));


    }



}
