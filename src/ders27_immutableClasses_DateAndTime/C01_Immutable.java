package ders27_immutableClasses_DateAndTime;

public class C01_Immutable {
    public static void main(String[] args) {

        //vu kod calistiginda java kac obje olusturur?  toplam 11 obje var.

        String str="Ali";//1 obje var

        for (int i = 0; i <10 ; i++) {

            str+=".";// 10 obje var
        }

        System.out.println(str);



    }
}
