package ders45_maps;

import ders44_maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {

        /*
            Ogrenciler map'inde subesiH olan ogrencilerin isim soyisim ve siniflarini yazdiralim
         */

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        /*
        {
         101=Ali-Can-10-H-MF,
         102=Veli-Cem-11-M-Soz,
         103=Ali-Cem-11-H-TM,
         104=Ayse-Can-10-H-MF,
         105=Ayse-Cem-11-M-TM,
         106=Fatma-Han-10-K-Soz
         }
         */




        Set<Integer> ogrenciKeySet=ogrenciMap.keySet();//bir map'deki  key'leri set olarak dondurur
        System.out.println(ogrenciKeySet);
        /*
        [101, 102, 103, 104, 105, 106]
         */

        Collection<String> ogrenciValueCollection =ogrenciMap.values();// bir map'deki tum value'leri bize collection olarak dondürür

        System.out.println(ogrenciValueCollection);
        /*
        [Ali-Can-10-H-MF,
        Veli-Cem-11-M-Soz,
        Ali-Cem-11-H-TM,
        Ayse-Can-10-H-MF,
        Ayse-Cem-11-M-TM,
        Fatma-Han-10-K-Soz]
         */

        /*
            normalde bilgiler arasina Java "," kullanilir
            biz de virgul kannabiliriz
            Ancak bu durumda value Collection'inin kac elemanli olduguna dikkat etmemiz gerekir
            virgul ile ayrilmis cok fazla element olabilir
            Fakat value'lerin bir butun olarak TEK BIR STRING oldugunun unutmamaliyiz
         */

    }
}
