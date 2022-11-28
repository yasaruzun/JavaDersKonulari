package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C01_PutIfAbsent {
    public static void main(String[] args) {

    Map<String,Integer> mp1=new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        System.out.println(mp1.putIfAbsent("D", 9));//null
        System.out.println(mp1);//{A=5, B=3, C=7, D=9}

        System.out.println(mp1.putIfAbsent("D", 15));//9

        /*
            putIfAbsent(K,V)  eger key daha once yoksa ekler ve null doner
                              eger key daha once varsa eklemek istedigimiz yeni degeri eklemez
                              ve eski var olan degeri dondurur
         */

    }
}
