package ders08_ternary_switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int a= 5;

        /*
        ternary operatörü tek başına kullanılamaz. sbebei ; ternary bize bir sonuç üretir.
        bu sonucu ya direk yazdırmali veya bir variable'a atamalıyız
        ürettiği sonuc string olduğu için variable de string olarak atıyoruz

         */

       String sonuc= a%2==0 ? "çift sayı" : " tek sayi";

       /*
       ternary 'nin sonucunu bir variable'a atayacaksak true ve false durumlarında üretilecek sonucun
       aynı data türüne uygun olması gerekir
      aksi halde CTE oluşur
      ama Ternary'i sout içinde kullanırsak sonuçların data türünün aynı olması şart değildir.
        */

       String sonuc2= a>10 ? "buyuk sayi": ""+2*a; //CTE vermemsi için string 'e cevirdik. CTE altını kırmızı çizmek demek


        System.out.println(a>10 ? "buyuk sayi":2*a);














    }
}
