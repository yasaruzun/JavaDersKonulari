package ders29_stringBuilder_accessModifier;

public class C04_AccesModifers {



        String isim="Ali"; // access modifier gorunmuyor, o zaman default access modifier gecerlidir.
                            // bu class'dan ve der29 packafe'i icerisindeki diger class'lardan kullanilabilir. manuel olarak default yazılamaz

        private static int sayi=10;

        public static void main(String[] args) {


                System.out.println(sayi);
                sayi=20;

                System.out.println(sayi);
        }
}
