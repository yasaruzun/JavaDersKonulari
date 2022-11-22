package ders34__overriding_polltmorphism;

public class BChild extends AParent {



    public void method1(){

        System.out.println("child class method1");
    }

    public void method2(int a){
        //overriding olabilmesi icin hem method ismi hem de
        //method signature ayni olmalidir
        System.out.println("child class method2");

    }

    public void method2(String isim){
        System.out.println("child class String parametli method2");

    }

    @Override
    public void method3() {
        //super.method3();

        //overriding varsa parent ve child class'daki
        // overridden ve overriding method'lardan sadece biri calisir
        //eger ikisini birden calistirmak isterseniz
        //super.overriddenMethodISmi yazilir

        /*
        Overriding method @Override rotasyonu ile isaretlenebilir
        @Override kullanilmayan overriding isleminde
        parent class'daki overriden method silinirse
        hicbir sorun olmaz

        Ancak @Override kullanilan overriding isleminde
        parent class'daki overriden method silinirse
        veya signature'i degistirilirse
        Java CTE verir, boylece overriden method'un silinmesi engellenir

         */

    }
}
