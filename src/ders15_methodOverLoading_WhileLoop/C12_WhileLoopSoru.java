package ders15_methodOverLoading_WhileLoop;



public class C12_WhileLoopSoru {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.



        int sayi=1453;
        int birlerBas;
        int rakamlarTop=0;


        while(sayi!=0){

            birlerBas=sayi%10;
            rakamlarTop+=birlerBas;
            sayi/=10;
        }

        System.out.println(rakamlarTop);

    }

}
