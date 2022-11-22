package ders16_doWhileLoop;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        // Ornek : input : 16, output: 4

        int input= 122;
        int baslangicDegeri=1;
        int bayrak=0;



        do{
            if(baslangicDegeri*baslangicDegeri==input){
                System.out.println("true");
                bayrak++;
                break;
            }//else gerek yok,

            baslangicDegeri++;

        }while(baslangicDegeri*baslangicDegeri<=input);

        if(bayrak==0){
            System.out.println("false");
        }
    }
}
