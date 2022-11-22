package ders16_doWhileLoop;

public class C02_DoWhileLoop {
    public static void main(String[] args) {


        // 10,11,12 sayılarını toplayan bir whileloop oluşturalım

        int sayi=10;
        int toplam=0;


        do{
            toplam+=sayi;
            sayi++;


        }while(sayi<=12);

        /*
       Do While Loop'un 2 avantajı vardır;
       1- Loop body'si en az 1 kere çalışır
            (while loop'da başlangıç değeri uygun değilse loop body'si hiç çalışmayabilir)

       2- while bitiş kontrolü loop kadar çalışır
            (while loop da 1 kere fazla çalışırdı)

         */



    }
}
