package ders15_methodOverLoading_WhileLoop;

public class C15_Soru {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        //olusturun.

        int sayi=2;
        int us=4;

        usAlmaMethodu(sayi,us);


    }
    public static void usAlmaMethodu(int sayi, int us){
        int sonuc=1;

        while(us>0){

            sonuc*=sayi;

            us--;

        }

        System.out.println(sonuc);
    }

}
