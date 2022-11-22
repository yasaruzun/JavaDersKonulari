package ders32_inheritanceConsructorCall;

public class Corolla extends Btoyota {

    Corolla (int pc){
        super(5);
        System.out.println("parametrei Corolla cons.");
    }
    Corolla(){

    }

    Corolla(String str){
        this();
        System.out.println("String parametreli Corolla Cons.");

    }

    public static void main(String[] args) {

        Corolla corolla3=new Corolla("Ilker");
//parametresiz araba constructor
//parametresiz toyota cons.
//String parametreli Corolla Cons.

        System.out.println("==========");
    Corolla corolla1= new Corolla();
//parametresiz araba constructor
//parametresiz toyota cons.
        System.out.println("==========");
    Corolla corolla2=new Corolla(3);
        //parametresiz araba constructor
        //parametreli toyota consturctor
        //parametrei Corolla cons.

    }
}
