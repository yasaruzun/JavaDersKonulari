package ders38_abstraction;

public abstract class CParentAbstractClass {

    /*
        Abstract bir class abstract methodlara sahip olabilir
        Bir class'i abstract yapmak icin class declaration'ina abdstract keyword eklenmelidir

     */

    public abstract void mecburiMethod1();
    public abstract void mecburiMethod2();
    //soyut yani abstract methodlarin body'si olmaz

    public void concreteMethod(){
        //bugune kadar kullandigimiz normal methodlara
        //soyut olmayan method demek yerine concrete method denir
    }

    /*
            Bir parent class'da child class'larin mutlaka override edeceği bir method olusturdugumuzda
            method body'si gereksizlerlesir
            cunku hic calismayacaktir

            1- abstract parent class'dan obje olusturulamayacagi icin objeler icin bu method kullanilamaz
            2- child class'lar da mecburen  bu methodu override edeceklerinden,
                bu methodlarin body'si asla KULLANILMAYACAKTIR

            Java hic kullanilmayacak bu method body'leri yazmamamiza imkan tanimistir


     */
    /*

        Child class'larin mutlaka override etmesini istedihimiz methodlari
        abstract olarak tanimlar ve body'siz olarak olusuturuz

     */


}
