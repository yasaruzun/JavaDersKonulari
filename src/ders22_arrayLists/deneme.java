package ders22_arrayLists;

import java.util.ArrayList;

public class deneme {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("A");

        list.add("B");

        list.add("C");

        list.add("D");

        for (int i = 0; i < list.size(); i++) {



            System.out.print(list.get(i) + " ");

        }
    }


}
