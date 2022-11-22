package grupCalismaları;

public class S30 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //bolenleri sayisini bulup bize donduren bir method olusturun.



        int sayi= 8;

        System.out.println(sayininTamBolenleriSayisi(sayi));

    }
    public static Integer sayininTamBolenleriSayisi(int sayi){
        int sayac=0;

        for (int i = 2; i <=sayi ; i++) {

            if(sayi%i==0){
                sayac++;

            }

        }


        return sayac;
    }
}
