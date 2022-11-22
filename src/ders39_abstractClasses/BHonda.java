package ders39_abstractClasses;

public abstract class BHonda extends Araba {

    /*
    Abstract bir class'i parent edindigimizde
    iki alternatifimiz olur;
    1- parent'imiz olan abstract class'daki abstract methodlarin override etmek
    2- proje yapimiz gerektiriyorsa bu class'i da abstract yapmak
         */

    public void marka(){
        System.out.println("marka: Honda");
    }


    public abstract void yakit();


    public abstract void guvenlik();

    public void ozelTeknoloji(){
        System.out.println("tum Honda arabalar vtec teknolojisi kullanir");
    }
}
