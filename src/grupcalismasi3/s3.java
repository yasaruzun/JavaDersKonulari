package grupcalismasi3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen listenizin uzunlugunu giriniz");

        int listUz=scan.nextInt();

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <listUz ; i++) {
            System.out.println("lütfen list uzunlgunuz adedince eleman giriniz");
            int girilenEleman=scan.nextInt();
            sayilar.add(scan.nextInt(i));
        }

        List<Integer> tekrarliList=new ArrayList<>();

        for (int i = 0; i <sayilar.size() ; i++) {

            if(sayilar.get(i)==sayilar.get(i+1)){
                tekrarliList.add(sayilar.get(i));

            }

        }

        System.out.println(tekrarliList);

    }


}
