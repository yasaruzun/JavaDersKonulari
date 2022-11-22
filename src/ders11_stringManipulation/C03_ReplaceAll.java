package ders11_stringManipulation;

public class C03_ReplaceAll {
    public static void main(String[] args) {


        //Regex (Regular Expressions)
        //\\s : space
        // \\S : space olmayan hersey
        //\\s+ : yanyana birden fazla space
        //\\d : digits
        // \\D : digit olmayan hersey
        //\\w : harf veya rakam Veya _
        // \\W : harf veya rakam olmayan hersey

        String str="J1ava2 G9üzel5dir8";

        //str'daki sayıları silip, metni java güzeldir haline döndürelim

        //str.replaceAll() sadece bir harf veya char sequence'i değil, genelleme ile söyleyebileceğimiz ortak özellikteki tüm karakterli değiştirir


        System.out.println(str.replaceAll("\\d",""));//Java Güzeldir
        System.out.println(str.replaceAll("\\D",""));//12958


        String s1= "ilk ürün fiyatı :1250 tl";
        String s2= "ikinci ürünün fiyatı : 1500 tl";

        //iki ürünün fiyatını toplayın

        s1=s1.replaceAll("\\D",""); //"1250"
        s2=s2.replaceAll("\\D","");//"1500"

        System.out.println(s1+s2);//12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));//2750



    }
}
