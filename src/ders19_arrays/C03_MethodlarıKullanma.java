package ders19_arrays;

import ders18_arrays.C03_ArraysElementleriniArttirma;
import ders18_arrays.C04_ArraysElementleriToplama;
import ders18_arrays.C05_ArraysdeElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlarıKullanma {
    public static void main(String[] args) {

        //verilen bir int array'in elementlerini 2 arttirin


        int [] arr={2,3,4};


        arr=C03_ArraysElementleriniArttirma.elementleri2Arttir(arr);


        System.out.println(Arrays.toString(arr));//[4, 5, 6]

            //arr array imin elementlerini toplayıp sonucu yazdırın

        System.out.println(C04_ArraysElementleriToplama.pozitifElementleriTopla(arr));//15

        //arr array'inde 10 element olarak var mı?

        C05_ArraysdeElemanArama.elemanAra(arr,10);//aranan sayi array'de yok

        //kullanıcıdan deger alarak bir array olusturun

       int[] yeniArr= C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));



    }
}
