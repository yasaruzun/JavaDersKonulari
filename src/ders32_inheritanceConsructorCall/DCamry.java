package ders32_inheritanceConsructorCall;

public class DCamry extends Btoyota {


   DCamry(String pc){
       super("deniz");
       System.out.println("String paramtreli camry");

   }

   DCamry(){

   }




    public static void main(String[] args) {
       //Eger kullanilan argumente uygun bir constructor
       //parent class'da yoksa direk CTE olur


        DCamry camry2=new DCamry("celal");
        //parametreli araba  constructor
        //Strig parametreli toyota cons.
        //String paramtreli camry





        System.out.println("==================");
        DCamry camry1= new DCamry();
        //parametresiz araba constructor
        //parametresiz toyota cons.


    }
}
