package ders09_stringManipulations;

public class C06_SubString {
    public static void main(String[] args) {

        String str= "java öğren, işi kap";

        System.out.println(str.substring(5));//öğren, işi kap
        System.out.println(str.substring(0));//java öğren, işi kap

        System.out.println(str.length());//19

        //son karakteri string olarak kaydedin
        String sonHarf=""+str.charAt(str.length()-1);
        sonHarf=str.substring(str.length()-1);

        System.out.println(sonHarf);//p

        //son indexideki karakteri upper case olarak yazdırın
        System.out.println(str.substring(str.length()-1).toUpperCase());//P

        //son üç harfi büyük harf olarak yazdırın
        System.out.println(str.substring(str.length()-3).toUpperCase());//KAP











    }
}
