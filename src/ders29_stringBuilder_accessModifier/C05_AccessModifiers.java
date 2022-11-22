package ders29_stringBuilder_accessModifier;

public class C05_AccessModifiers {
    public static void main(String[] args) {


        C04_AccesModifers obj= new C04_AccesModifers();

        obj.isim="yasar";
        System.out.println(obj.isim);//yasar
        //obj.sayi; private variable lara baska class'dan ulasilamaz

        C04_AccesModifers obj2= new C04_AccesModifers();

        System.out.println(obj2.isim);//diger class daki Ali'yi yazdirir
    }
}
