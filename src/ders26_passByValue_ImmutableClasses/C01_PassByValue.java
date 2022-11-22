package ders26_passByValue_ImmutableClasses;

public class C01_PassByValue {


    public static void main(String[] args) {


        double fiyat=100;

        System.out.println(indirimUygula(fiyat));//90
        System.out.println(fiyat);//100

        fiyat=indirimUygula(fiyat);
        System.out.println("indirim uygulanmis yeni fiyat :"+fiyat);
    }

        //kodlarimizin anlasilir olmasi icin ain method'dan diger
        // methodlara parametre olarak gönderdigimiz variable'lar icin aynı isimli
        //variable olusturmayi tercih ederiz.

    //java method'lar arasinde gecis yaparken variable'ı degil, variable'in value 'sunu pass eder.
    //Bu java'nin pass by value 'yu tercih etmesinden kaynaklaniyor.

    //eger method'un icersinde yaptiginiz degisikligin maiin method icin de gecerli
    // olmasinii isterseniz main method icerisinde
    // fiyat=indirimUygula(fiyat); atamasini yapabilriz.
    //
    private static double indirimUygula(double fiyat) {

        //%10 indirim yapsin

        fiyat=fiyat*0.9;//fiyata atama yaptik , kalici olarak 90 oldu.

        return fiyat;
    }
}
