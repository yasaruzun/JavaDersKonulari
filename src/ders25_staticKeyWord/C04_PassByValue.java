package ders25_staticKeyWord;

public class C04_PassByValue {
    public static void main(String[] args) {


        double fiyat=100;

        System.out.println(indirimUygula(fiyat));//90
        System.out.println(fiyat);//100


    }

    private static double indirimUygula(double fiyat) {

        //%10 indirim yapsin

        fiyat=fiyat*0.9;//fiyata atama yaptik , kalici olarak 90 oldu.

        return fiyat;
    }
}
