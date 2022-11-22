package ders17_scope;

import java.util.Scanner;

public class C05_ObjectVariables {
    public static void main(String[] args) {

        //C03 class'indaki instance variable'lara nasil ulasabiliriz
        //instance variable'larin diger adi obje variable'ridir.
        //instance variable'lara obje uzerinden ulasabiliriz

        //Scanner scan=new Scanner(System.in);//obje

        C03_ObjectVariables pers1=new C03_ObjectVariables();


        System.out.println(pers1.personelIsmi);//isim girilmesi
        System.out.println(pers1.personelYasi);//0

        pers1.personelIsmi="Suleyman";
        pers1.personelYasi=35;
        pers1.personelTelefonu="555 335 67 54";


        System.out.println(pers1.personelIsmi);//Suleyman
        System.out.println(pers1.personelYasi);//35

        C03_ObjectVariables pers2=new C03_ObjectVariables();

        pers2.personelIsmi="Latif";
        pers2.personelYasi=32;
        pers2.personelTelefonu="555 456 25 85";

        System.out.println(pers1.personelIsmi);//Suleyman
        System.out.println(pers2.personelIsmi);//Latif

        C03_ObjectVariables pers3=new C03_ObjectVariables();

        pers3.personelIsmi="Yasar";
        pers3.personelYasi=30;
        pers3.personelTelefonu="536 261 20 20";

        System.out.println(pers1.personelYasi);//35
        System.out.println(pers2.personelYasi);//32
        System.out.println(pers3.personelYasi);//30

    }

}
