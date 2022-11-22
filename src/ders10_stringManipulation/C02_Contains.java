package ders10_stringManipulation;

public class C02_Contains {
    public static void main(String[] args) {


       String str= "java ile kodlama çok zevkli";

        System.out.println(str.contains("çok"));//true
        System.out.println(str.contains("odla"));//true

        System.out.println(str.contains("a"));//true

        //'s' kabul etmez.



        String str2= "java";
        System.out.println(str.contains(str2));//true












    }
}
