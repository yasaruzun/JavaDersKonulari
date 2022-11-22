package ders40_Interfaces;

import ders39_abstractClasses.Interface02;

public class I02_ConcreteChildClassOfInterfaces implements I01_Interface {

    /*
           Bir class'i bir interface'in child'i yapmak icin
           implements keyword kaullanilir
     */


    public static void main(String[] args) {

        System.out.println(ISIM);

       // sayi=40;   Cannot assign a value to final variable 'sayi'
        //yazili olmasa da interface icerisinde oldugundan final'dir ve atama yapilamaz


        System.out.println(Integer.MAX_VALUE);
        //normalde variable isimleri, kucuk harfle baslar ve camelCaase kullanilir,
        //Ancak java da ortak kabul olarak
        //static ve final olarak isaretlenen variable isimleri tamamen buyuk harf ile yazilir


        System.out.println(Math.PI);

    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
