package ders38_abstraction;

public class DChildClassOfAbstractClass extends CParentAbstractClass {


    /*
        Abstract bir class'daki, abstract methodlarin tamami
       concrete child class'lar tarafindan override edilmelidir.
     */

    @Override
    public void mecburiMethod1() {
        System.out.println("child class method icerisinde method1'i kendine uyarlar");
    }

    @Override
    public void mecburiMethod2() {
        System.out.println("child class method icerisinde method2'i kendine uyarlar");

    }

}
