package selfStudy;

import java.util.ArrayList;
import java.util.List;

public class S19 {
    // 2 den 100'e kadar olan muhtesem asal sayilari ekrana yazdiriniz.
    // Muhtesem asal sayi ; asal sayilarin toplamiyla elde edilen asal sayilara denir.

    //  örn:
    //  2+3=5   2+3+5+7=17      2+3+5+7+11+13=41
    //  ekran ciktisi:  5 17 41 197 . . .

    public static void main(String[] args) {

        int asalToplam=2;
        boolean asalKontrol=false;
        String sonuc="";



        List<Integer> muhAsalSayilar=new ArrayList<>();

        for (int i = 3; i <100 ; i++) {

            for (int j = 3; j <100 ; j++) {
                if(i%j!=0 && i%1==0 ){
                    asalToplam+=i;
                   if (asalToplam%i==0){
                       sonuc="asal degil";
                   } else if (sonuc.equalsIgnoreCase("asal degil")) {
                       muhAsalSayilar.add(asalToplam);

                   }

                }
            }





        }

        System.out.println(muhAsalSayilar);

    }
}
