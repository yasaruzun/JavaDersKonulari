package grupCalismaları;

public class S34 {
    public static void main(String[] args) {


        ////Soru 1- 'k' harfinden 't' harfine kadar harfleri yazdirin.



        char harf = 'k';
        String toplam = "";
        do {


            toplam+=harf+"_";

            harf++;
        }while (harf<='t');

        System.out.print(toplam);

    }
}
