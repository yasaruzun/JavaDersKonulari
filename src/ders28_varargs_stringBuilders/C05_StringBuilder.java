package ders28_varargs_stringBuilders;

public class C05_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Java candir.");

        System.out.println(sb.capacity());//16+12
        System.out.println(sb.length());//12

        System.out.println(sb.reverse()); //.ridnac avaJ
        sb.reverse();

        sb.replace(0,4,"Ahmet Hoca");

        System.out.println(sb);//Ahmet Hoca candir.

        sb.insert(18,"bu bir yalandir");
        System.out.println(sb);

        String str="Java çok güzel ";

        sb.insert(21,str,9,15);
        System.out.println(sb);


    }
}
