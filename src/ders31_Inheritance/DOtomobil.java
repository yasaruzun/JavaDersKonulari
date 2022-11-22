package ders31_Inheritance;

import org.w3c.dom.stylesheets.LinkStyle;

public class DOtomobil extends BinekArac {

    public static void main(String[] args) {

        DOtomobil oto1= new DOtomobil();
        System.out.println(oto1.marka);

        //Inheritance sayesinde bir child class
        // olusturdugumuzda yeni hicbir variable veya
        // method olusturmadan parent class'lar'daki tum ozellikleri almis oluruz.
        // Child class'da parent'dan gelen ozellikleri update edebilir veya yeni ozellikler ekleyebilriz.



    }
}
