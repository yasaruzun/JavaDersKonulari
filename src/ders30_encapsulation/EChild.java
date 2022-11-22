package ders30_encapsulation;

public class EChild extends DParent {

    /*
    Java'daki Inheritance'in insanlardan en buyuk farki:

    iinsanlarda parent child edinebilir
    ama child parent'ini secemez

    Java'da ise tam tersinidir. Yani siz bir class olusturdugunuzda
     daha once olusturulmus class'lardan tum ozelliklerini
    inherit etmek istediginiz class'i parent edinirsiniz

    Bir class baska bir class'i inherit etmek istediginde extends keyword ile bunu deklare eder

     */

    public static void main(String[] args) {

        EChild child1=new EChild();

        child1.yas=30;
        child1.isim="mahmut";
        child1.isEnough=false;





    }
}
