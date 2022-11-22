package ders12_forLoops;

import java.util.Scanner;

public class C07_DenemeForLoops {
    public static void main(String[] args) {



        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String input=" java ile yeni bir dünyaya merhaba de";

        String yeniInput="";

        for (int i = input.length()-1; i >=0 ; i--) {

            yeniInput+=input.substring(i,i+1);

        }
        System.out.println(yeniInput);
    }
}
