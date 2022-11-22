package ders26_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class C06_ImmutableClasses {
    public static void main(String[] args) {


        String str= " Java güzeldir";

        System.out.println(str.toUpperCase());//JAVA GÜZELDİR

        System.out.println(str);// java güzeldir

        str.toLowerCase();

        System.out.println(str);//Java güzeldir


        //String immutable oldugu icin method ile yapilan degisiiklikler String'i kalici degistirmez

        List<String> harfler=new ArrayList<>();

        harfler.add("A");

        harfler.add("B");

        harfler.remove(0);

        System.out.println(harfler);//[B]

        //List ve array mutable olduklari icin method ile yapilan degisikler kalici olur



    }
}
