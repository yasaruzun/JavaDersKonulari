package ders15_methodOverLoading_WhileLoop;

public class C09_WhileLoopMethod {
    public static void main(String[] args) {



        int sayi= 1453;

        System.out.println(rakamlarToplami(sayi));
        System.out.println(rakamlarToplami(4343434));

    }

    public static int rakamlarToplami(int sayi){

        int birlerbasamagi=0;
        int rakamlarToplami=0;


        while (sayi!=0){

            birlerbasamagi=sayi%10;
            rakamlarToplami+=birlerbasamagi;
            sayi/=10;


        }

        return rakamlarToplami;

    }

}
