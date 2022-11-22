package ders28_varargs_stringBuilders;

public class C01_Varargs {
    public static void main(String[] args) {

        toplam(5,6);
        toplam(5,3,8);
        toplam(2,4,6,8);

    // parametre sayisi degistikce biden yeni method olusturmamizi ister.
        //


    }

    private static void toplam(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("4 sayinin toplami :"+(sayi1+sayi2+sayi3+sayi4));

    }

    private static void toplam(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 sayinin toplami :"+(sayi1+sayi2+sayi3));

    }

    private static void toplam(int sayi1, int sayi2) {

        System.out.println("2 sayinin toplami :"+(sayi1+sayi2));
    }
}
