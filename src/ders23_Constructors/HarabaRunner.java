package ders23_Constructors;

public class HarabaRunner {
    public static void main(String[] args) {

        Haraba arb1=new Haraba();

        arb1.marka="Toyota";
        arb1.model="Corolla";
        arb1.yakit="Dizel";
        arb1.yil=2010;
        arb1.fiyat=12000;

        System.out.println(arb1);

        Haraba arb2=new Haraba("Honda","Civic","benzin",1990,12000);
        System.out.println(arb2);


        Haraba arb3=new Haraba("tofas","dogan","gaz",1999,10000);
        System.out.println(arb3);

        Haraba arb4=new Haraba("opel","corsa",2010);
        System.out.println(arb4);

    }
}
