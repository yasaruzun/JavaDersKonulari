package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMap {
    public static void main(String[] args) {

        TreeMap<String,Integer> mp1=new TreeMap<>();

        mp1.put("A",5);
        mp1.put("H",3);
        mp1.put("C",7);
        mp1.put("T",8);
        mp1.put("F",10);

        System.out.println(mp1);//{A=5, C=7, F=10, H=3, T=8}

        System.out.println(mp1.higherKey("D"));
        System.out.println(mp1.higherKey("H"));
    }
}
