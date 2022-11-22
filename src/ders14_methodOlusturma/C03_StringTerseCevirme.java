package ders14_methodOlusturma;

public class C03_StringTerseCevirme {


    //parametre olarak bir string kabul edip
    //string'in terse çevrilmiş halini döndüren bir method oluşturun


    public static void main(String[] args) {

        String input="java kod yazdıkca öğrenilir";

        System.out.println(tersCevirmeMethodu(input));


    }

    public static String tersCevirmeMethodu(String input){

        String tersStr= "";
        for (int i = input.length()-1; i >=0 ; i--) {

            tersStr=tersStr+input.charAt(i);

            
        }

        return tersStr;

    }

}
