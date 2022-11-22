package ders29_stringBuilder_accessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {

    /*
    buyuk projeşerde datayi gorme(read) veya datayi degistirme (write)
    yetkilerini birbirinden bagimsiz olarak düzenlemek istenebilir


    Access modifier ile class uelerine baska class'lardan erisim sinirlandirilabilir
    ANCAK
    ulasilabilen dataya hem okuma hem yazma yapilabilirken
    ulasilamayan data ne okunabilir ne de degistirilebilir


    gercek hayattaki ihtiyaclar dusunuldugunde javaya yetki sinirlamayi uyarlamak istersek
    -Eger okuma ve yazma yetkisini birlikte vermek veya vermemek sozkonusu ise o zaman
     access modifier kullanilir.

    -Eger okuma ve yazma yetkileri birbirinden ayrilacaksa
     o zaman access modifier yeterli olmaz Encapsulation(getter ve setter method'lari)kullanilmalidir.
     */

    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);


    }
}
