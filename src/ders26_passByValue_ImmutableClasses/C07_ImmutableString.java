package ders26_passByValue_ImmutableClasses;

public class C07_ImmutableString {
    public static void main(String[] args) {

        String str="Java Candir";

        str=str.toUpperCase();

        System.out.println(str);//JAVA CANDİR

        //Immutable class'lardan olusturulan bir obje'nin degeri degisitirilemez
        //eger atama yaparsak java degerini degistirmez , bunun yerine yeni bir obje olusturur
        //ve bu yeni objeye yeni atadiginiz degeri atar
        //eski obje bosa cikar ve  garbage collector tarafindan silinmeyi bekler






    }
}
