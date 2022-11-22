package ders03_datacastingWrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {


        int sayi= 20;

        /*
        genis data turundeki bir degeri
        dar data turundeki bir variable'a atamak isterseniz
        java sorumlulugunu almanizi ister
        bu sorumlulgugu almak icin
        cast edecegimiz degerin onune () icersinde cast etmek istedigimiz data turu yazılır

        ancak bu durumda data kayitlari (double'dan int'e gecerken virgulden sonrası silinir)
        veya baskalasim olabilir( int'i byte cevirisek tekrar tekrar basa doner)
        */
        short sh = (short)sayi;

        System.out.println(sh);

        double dbl = 23.5;

        int say = (int) dbl;

        System.out.println(say); // int oldugu icin virgulden sonrasını atar 23 gorunur. bu kisim ONEMLI

        say = 127; // int

        byte byt = (byte) say;

        System.out.println(byt);










    }
}
