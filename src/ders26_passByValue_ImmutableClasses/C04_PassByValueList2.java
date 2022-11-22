package ders26_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {
    public static void main(String[] args) {


        //bir method olusturalim
        // method'da yeni bir Liste olusturun
        // Listeye sayilar listesindeki degerlerin 5 fazlasini
        // element olarak atayin
        //sonra sayilar listesine deger olarak yeni listi atayin
        // ve sayilar list'ini yazdirin

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListDegeriAta(sayilar);

        System.out.println("method call dan sonra main method da sayilar list :"+sayilar);

    }
    public static void yeniListDegeriAta( List<Integer> sayilar){

        //bir method olusturalim
        // method'da yeni bir Liste olusturun
        List<Integer>yeniList=new ArrayList<>();

        // Listeye sayilar listesindeki degerlerin 5 fazlasini

        for (int i = 0; i <sayilar.size() ; i++) {

            yeniList.add(sayilar.get(i)+5);

        }

        // element olarak atayin
        //sonra sayilar listesine deger olarak yeni listi atayin
        sayilar=yeniList;

        // ve sayilar list'ini yazdirin

        System.out.println("method'da sayilar listesinin son hali :"+sayilar);


    }
}
