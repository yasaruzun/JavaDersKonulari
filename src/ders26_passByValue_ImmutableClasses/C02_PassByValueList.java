package ders26_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        //bir method olusturalim ve method'da List'deki sayilari 5 arttiralim ve method'da listenin son halini yazdiralim


        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elementleri5Arttir(sayilar);
        elementleri5Arttir(sayilar);
        elementleri5Arttir(sayilar);

        //method call sonrasi main method icersinde List'i tekrar yazdiralim
        System.out.println("method call sonrasi main method'da List :"+ sayilar);

    }

    public static void elementleri5Arttir(List<Integer> sayilar){

        for (int i = 0; i <sayilar.size() ; i++) {

            sayilar.set(i,sayilar.get(i)+5);

        }

        System.out.println(sayilar);


    }
}
