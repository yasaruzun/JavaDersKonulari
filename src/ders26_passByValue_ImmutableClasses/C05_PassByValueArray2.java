package ders26_passByValue_ImmutableClasses;

import java.util.Arrays;

public class C05_PassByValueArray2 {
    public static void main(String[] args) {

        //bir method olusturun
        //sayilar  array'in uzunlgundan 2 fazla olan
        // ve elementlerin tamami 5 olan yeni bir array olusuturp,
        //deger olarak sayilar array'ine atayin ve syilar array'ini yazdirin


        int [] sayilar={3,4,5};

    arrayeYeniDegerAta(sayilar);


        System.out.println(Arrays.toString(sayilar));
    }

    public static void arrayeYeniDegerAta(int [] sayilar){

        int [] yeniArr=new int[sayilar.length+2];

        for (int i = 0; i <yeniArr.length ; i++) {

            yeniArr[i]=5;



        }
        sayilar=yeniArr;
        System.out.println("method'da sayilar'in son hali :"+ Arrays.toString(sayilar));
    }
}
