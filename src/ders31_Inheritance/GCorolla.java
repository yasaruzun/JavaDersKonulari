package ders31_Inheritance;

public class GCorolla extends FToyota {

    String model="Corolla";
    String uretimYeri="Turkiye";

    GCorolla(){
        super();
        System.out.println("Corolla constructor'u calisti");
    }


    public static void main(String[] args) {

        GCorolla corollo1=new GCorolla();

        System.out.println(corollo1.marka);//toyota


        /*
        bir child class da obje olusturdugumuzda
        olusturulan obje child class'a ait ozellikleri degil tum parent
        class'larindaki ozellikleri de tasiir
        Bir obje'nin bir class'in ozelliklerini tasimasi icin o obje olusturulurken class'a ait cons.'in calismis olmasi gerekir
        yani child class'indaki obje olusturulurken tum parent class'lardaki const.'larda otomatik olarak calisir

        Java bu islem icin soyle bir mekanizma gelistirmistir
        Bir class olusturdugumuzda bir const. olusturmasak da
        java'nin o class'a default const. koydgu GIBI
        extends keyword kullanan bir class'da olusturulan
        her bir const'ın ilk satirina biz gormesek de super() cons. call koyar.
         */


    }
}
