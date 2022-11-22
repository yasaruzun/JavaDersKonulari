package ders21_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlarıSilme {
    public static void main(String[] args) {


        //verilen bir array'deki tekrar eden sayıları bir kere olacak sekilde arryi duzenleyin


        int[]arr= {1,2,3,4,5,6,7,4,3,4,5,6,4,3,4,5,7,8,9,7};
//          bu soruyu array ile yapmak cok zor
        // bunun yerine bu array'in elemanlarını tek tek inceleyip tekrarsız olanları bir list'e atalım

        List<Integer> tekrarsizListe=new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {

            if(!tekrarsizListe.contains(arr[i])){

                tekrarsizListe.add(arr[i]);

            }


        }


        System.out.println("tekrarsiz liste: " + tekrarsizListe);//[1, 2, 3, 4, 5, 6, 7, 8, 9]

        //en son o list'deki elemenleri array'e atamak gerekir
        //bunun icin once array'e yeni ve bos bir array degeri atayip
        //sonra list'deki elementleri array'e tasiyalim


        arr=new int[tekrarsizListe.size()];//[0,0,0,0,0,0,0,0,0]

        for (int i = 0; i <arr.length ; i++) {

            arr[i]= tekrarsizListe.get(i);
        }

        //array istenen hale geldi


        System.out.println("Array'in tekrarsiz hali : " +Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
