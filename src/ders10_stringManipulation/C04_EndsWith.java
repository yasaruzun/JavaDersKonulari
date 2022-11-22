package ders10_stringManipulation;

public class C04_EndsWith {
    public static void main(String[] args) {

        String str= "java heryerde güzel";

        System.out.println(str.endsWith("güzel"));//true

        System.out.println(str.endsWith(""));//true

        System.out.println(str.endsWith("java heryerde güzel"));//true

        System.out.println(str.endsWith("heryerde"));//false






    }
}
