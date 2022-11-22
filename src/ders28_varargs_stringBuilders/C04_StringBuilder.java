package ders28_varargs_stringBuilders;

public class C04_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder(7);

        //bu kod yazildiginda java 7 karakter alabilecek bir SB olusturur

        System.out.println(sb.capacity());//7

        System.out.println(sb.length());//0 hic bir deger atanmadigi icin

        sb.append("Java");

        System.out.println(sb);
        System.out.println(sb.capacity());//7
        System.out.println(sb.length());//4

        sb.append(" guzeldir.");

        System.out.println(sb);//Java guzeldir.
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//14

        sb.append(" ona ne suphe");

        System.out.println(sb);//Java guzeldir. ona ne suphe
        System.out.println(sb.capacity());//34
        System.out.println(sb.length());//27

        //kapasite ve length'i esitlemek istersek

        sb.trimToSize();
        System.out.println(sb.capacity());//27
        System.out.println(sb.length());//27



    }
}
