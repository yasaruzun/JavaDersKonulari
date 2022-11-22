package ders22_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {
    public static void main(String[] args) {

        Integer[]arr={1,2,3};

        //verilen bir array'i List'e cevirmek icin bir List olusturup for loop ile elementleri tasimayi tavsiye ediyoruz

        List<Integer> arraydenList= Arrays.asList(arr);

        System.out.println(arraydenList);//[1, 2, 3]

        //bu yontemin 2 negatif yonu vardir;
        //1-bu sekilde olusturulan List'ler esnek uzunluga sahip degilllerdir.
        //add,remove gibi ozellikleri kullanmak isterseniz runTimeException olusur.

        //arraydenList.add(10);

       // System.out.println(arraydenList); //UnsupportedOperationException

       //arraydenList.remove(1); UnsupportedOperationException


        // 2- bu yontem kaynak olan array ile yeni olusturulan List'i birbirine baglar
        // birinde yaptiginiz degisikligi otomatik olarak digerine de yansitir

        System.out.println("Array :" +Arrays.toString(arr));//[1, 2, 3]
        System.out.println("Liste : "+arraydenList);//[1, 2, 3]

        //sadece array in bir elemanini degistirelim

        arr[0]=10;
        System.out.println("Array'i degistirince Array :" +Arrays.toString(arr));//[10, 2, 3]
        System.out.println("Arrayi deigsitirnce list : "+arraydenList);//[10, 2, 3]

    }
}
