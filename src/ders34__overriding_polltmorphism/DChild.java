package ders34__overriding_polltmorphism;

public class DChild extends CParent {

    /*Overriding kurallari

    1- access modifier method signature'a dahil olmadigindan overridden ve overriding
       access modifier'lar farkli olabilir
       child , parent'ı sinirlandiramaz, yani overriding method'un access modifier'i ayni veya
       daha genis kapsamli olmalidir

       private>>default>>protected>>public



    */

    public void method1(){

    }

    /*
        2-  private ve static methodlar override edilemez
            ayni isimde method olusturulunca java CTE vermez
            ancak override isareti cıkmaz ve
            @Override notasyonu kullanilmak istenirse CTE olur
            yani java bunlari farkli class'lardaki farkli method'lar olarak kabul eder
    */

    public static void method2(){

    }
    private void method3(){

    }
    /*
        3-  return type method signature'a dahil olmadigindan
            farkli secilebilir, ancak
            return type void veya primitive ise ayni olmak zorunadir
            eger return type'lar non-primitive ise
            Child class'daki return type, parent class'daki return type'i
            ile ayni veya child'i olmalidir

     */

    public void method4(){

    }

    public Integer method5(){
        return 5;

    }

}
