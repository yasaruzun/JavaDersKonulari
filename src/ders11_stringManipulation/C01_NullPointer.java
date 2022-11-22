package ders11_stringManipulation;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1="";
        //str1'e değer atanmıştır

        System.out.println(str1); //hiçlik yazdırı.
        System.out.println(str1.concat("java")); //java

        String str2;

        //str2 oluşturuldu ama değer atanmadı

       // System.out.println(str2); değeri atanmadığı için yazdırılamadı


        //System.out.println(str2.concat("java")); değer ataması yapılmadığı için bu da çalışmaz

        str2="java candır";

        System.out.println(str2);//java candır
        System.out.println(str2.concat("."));//java candır.

        String str3=null; // str3'e değer atanmamıştır. null pointer ile javaya değer atamadığımızın farkında olduğumuzu söylüyoruz

        System.out.println(str3); // hata vermiyor. null işaretlendiğini yazdırır.

       // System.out.println(str3.concat("java")); //başka bir string ile birleştirmeye çalıştığımızda öndesinde bir değer olmadığı için yazdırmada hata verir.

        System.out.println(str3+"java");//nulljava

        System.out.println(str3.toUpperCase());//hata verir.methot kullanamayız.





    }
}
