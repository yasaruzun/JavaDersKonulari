package ders32_inheritanceConsructorCall;

public class Btoyota extends Araba {

    Btoyota (){

        System.out.println("parametresiz toyota cons.");
    }

    Btoyota (int p){

        System.out.println("parametreli toyota consturctor");


    }
Btoyota (String pt2){
        super("mehmet");
    System.out.println("Strig parametreli toyota cons.");
}
}
