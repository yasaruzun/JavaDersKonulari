package ders11_stringManipulation;

public class C05_Repeat_Trim {
    public static void main(String[] args) {

        String str= "java güzeldir\n ";

        System.out.println(str.repeat(4)); //java güzeldir java güzeldir java güzeldir java güzeldir

        str="     java güzeldir     ";


        System.out.println(str.length());//23

        str=str.trim();// baştaki ve sonraki boşlukları siler trim.

        System.out.println(str);//java güzeldir
        System.out.println(str.length());//13







    }
}
