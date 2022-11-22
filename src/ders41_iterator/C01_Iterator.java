package ders41_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

    //JAva collections icerisindeki bazi class'lar index desteklemez
        //bu durumda index kullanmadan collection icerisindeki tum elementlere ulasabilmek
        //  ve onlari update edebilmek icin farkli ihtiyaclarimiz olur


        //List<> index yapisini destekledigi icin, boyle bir ihtiyac duymaz
        //ancak bugunluk index kullanmadan List' elementlerine ulasmaya ve onlari update etmeye calisalim


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        /*
         Index kullanmadan list'in tum elementlerini yazdirin
         */

        for (Integer each:sayilar
             ) {
            System.out.print(each+" ");
        }
        System.out.println("");
        //index kullanmadan list'in elementlerini birer arttirin

        for (Integer each:sayilar
             ) {
            System.out.print(each+1 +" ");
        }
        System.out.println("");


        for (Integer each:sayilar
             ) {
            each+=1;
            System.out.print(each+" ");
        }
        System.out.println("");
        System.out.print(sayilar);


        /*

        Index kullanmadan List'in elemanlarini kalici olarak degistirmek mumkun olmadi
        Java bunun  icin Iterator interface'i olusturmustur
         */




        //index kullanmadan 25'den buyuk sayilari list'den silin




    }
}
