package ders32_inheritanceConsructorCall;

public class GAvciKuslar extends FKuslar {
    public static void main(String[] args) {

        GAvciKuslar ac1=new GAvciKuslar();


        FKuslar avci2=new GAvciKuslar();


        EHayvanlar avci3= new GAvciKuslar();

        /*
            Bir child class'da obje olusturmak icin child class constructor'u
            kullanilir.

            Ama data turunu
             o obje'ninbagli oldugu class'lardan secebilriz.

             Eger constructor ve data turu farkli secilirse
             bu durumda class uyesi olan
             variable'lar ve method'lar farkli davranislar gosterirler

         */



    }
}
