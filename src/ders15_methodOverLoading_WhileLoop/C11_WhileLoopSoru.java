package ders15_methodOverLoading_WhileLoop;

public class C11_WhileLoopSoru {
    public static void main(String[] args) {
        //  1’den 20’ye kadar olan tam sayıların toplamı:

        int toplam=0;
        int sayi=0;
        int toplam2=0;

        while(sayi<20){
            toplam+=sayi;
            sayi++;


        }
        System.out.println("toplam :" + toplam);


        for (int i = 1; i <20 ; i++) {
            toplam2+=i;

        }
        System.out.println("toplam: "+toplam2);

    }
}
