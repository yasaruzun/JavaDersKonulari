package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] arr={"Ali","Ulus","Nesrin"};

        //bu array'in tüm elementlerini aralarında bir bosluk birakarak yazdiralim


        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i] + " ");

        }

        //bu array'i array olarak yazdiralim

        System.out.println(arr);
        //array bir obje/non-primitive data oldugundan java referansini yazdirir
        //array'i array olarak yazdirmak istersek Arrays class'indan yardim almalisiniz.

        System.out.println(Arrays.toString(arr));//     [Ali, Ulus, Nesrin]








    }
}
