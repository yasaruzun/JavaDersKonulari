package ders09_stringManipulations;

import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] args) {

        String str = "Java Mutluluktur";

        System.out.println(str.toUpperCase());//JAVA MUTLULUKTUR

        str=str.toUpperCase();

        System.out.println(str);

        str="ince mehmet";

        str=str.toUpperCase();

        System.out.println(str);

        str=str.toLowerCase();
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));






    }
}
