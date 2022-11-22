package ders10_stringManipulation;

public class C03_StarsWith {
    public static void main(String[] args) {

        String str="mantı açarken java öğrenilmez";

        System.out.println(str.startsWith("Mantı"));//false

        System.out.println(str.startsWith("m"));//ttrue

        System.out.println(str.startsWith("mantı açarken java öğrenilmez"));//true

        System.out.println(str.startsWith(""));//true

        System.out.println(str.startsWith("açarken", 6));//true

        System.out.println(str.startsWith("mantı",0));//true

        System.out.println(str.startsWith("java",10));//false




    }
}
