package ders15_methodOverLoading_WhileLoop;

public class C08_WhileLoop {
    public static void main(String[] args) {

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        int sayi= 1453;
        int birlerbasamagi=0;
        int rakamlarToplami=0;




        while (sayi!=0){

            birlerbasamagi=sayi%10;
            rakamlarToplami+=birlerbasamagi;
            sayi/=10;

        }
        System.out.println(rakamlarToplami);








    }
}
