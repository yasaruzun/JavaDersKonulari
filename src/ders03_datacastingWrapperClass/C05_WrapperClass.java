package ders03_datacastingWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {


        int sayi = 10;

        String str = " java cok guzel";

        /*
        primitive data turleri sadece deger barındırılar, hazir metodları yoktur
        java'ya yapilan talepler sonucunda java
        primitive data türleri ile bazi hazir metodların kullanılabilmesi icin
        Wrapper class'lar oluşturmuştur.


        Wrapper Class'lar primitive data türlerindeki degerleri alirler
        Ancak metodları da vardir.
         */


        char krk = 'b';
        Character krkWrapper = 'c';


        System.out.println(Character.isLetter('5'));//false

        System.out.println(Character.isDigit('7')); //true

        String str1 = "123";
        String str2 ="12";

        //str ve str2'nin degerleri matematiksel olarak toplayin

        System.out.println(str1+str2); // 12312

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); //135


        // Integer.parseInteger(str) icine yazilan str rakamlardan olusuyorsa str'ı int'a ceviri
        // ancak bir karakter bile rakam degilse hata verir

        System.out.println(Integer.MAX_VALUE); //2147483647

        System.out.println(Short.MIN_VALUE); //-32768

        short s1=20;
        int s2=s1;


        Short shr1=20;

      //  Integer shr2= shr1; non primitive data türleri birbirine bu kadar kolay ceviremeyi













    }
}
