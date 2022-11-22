package ders08_ternary_switch;

public class C04_Ternary {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.


        int kenar1=0;
        int kenar2=0;
        int kenar3=0;

        System.out.println(kenar1>0&& kenar2>0&&kenar3>0&&
                kenar1==kenar2 && kenar2==kenar3 ? "eşkenar üçgen": "eşkenar değil");



        //kullanıcıdan 2 sayi alın ve buyuk olmayanı yazdırın

        int sayi1=12;
        int sayi2=11;


        System.out.println(sayi1>sayi2 ? sayi2: sayi1);









    }
}
