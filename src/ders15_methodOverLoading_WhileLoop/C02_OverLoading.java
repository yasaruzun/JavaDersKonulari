package ders15_methodOverLoading_WhileLoop;

public class C02_OverLoading {
    public static void main(String[] args) {

        carpim(3,5);//method call sırasında methoy parantezine yazılanlara argüment denir
        carpim(3.4,2);

   }
    //Bir class da aynı isim ve aynı signature sahip 2 method olmaz
    /*
    method overloading olan classlarda java hangi methodun çalışacağına şu şekilde karar verir;
    1-önce method ismine bakar
    2-argüment sayısı ile parametre sayısına bakar
    3-argüment ve parametre uyumuna bakar
    4-minimum casting

     */

    public static void carpim(int sayi1, int sayi2){
        System.out.println("iki integer sayının çarpımı:" +sayi1*sayi2);


    }

    public static void carpim(int sayi3, int sayi4, int sayi5) {
        System.out.println("üç integer sayının çarpımı:" + sayi3 * sayi4*sayi5);

    }

    public  static void carpim(double sayi1, double sayi2){
        System.out.println("double ve integar 2 sayının çarpımı:" +sayi1*sayi2);


    }

}
