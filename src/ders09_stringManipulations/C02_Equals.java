package ders09_stringManipulations;

public class C02_Equals {
    public static void main(String[] args) {

        String str1= "Ali";

        String str2= "ali";

        String str3= new String("Ali");
        String str4= "Ali";

        System.out.println(str1==str2); //false

        System.out.println(str1==str3);//false

        System.out.println(str1==str4);//true

        /*
        == String'leri karşılaştırırken  beklediğimiz sonuçları vermeyebilir
        String'lerde metinlerin aynı olup olmadığını karşılaştırmak için == işareti yerine "equals () methodu kullanılır.

         */

        System.out.println(str1.equals(str3));//true










    }
}
