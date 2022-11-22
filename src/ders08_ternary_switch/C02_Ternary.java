package ders08_ternary_switch;

public class C02_Ternary {
    public static void main(String[] args) {



        String str1="Ali";
        String str2="ALİ";

        /*
        verilen 2 metin birbiri ile aynı ise "metinler aynı"
        farklı ise "metinler farklı" yazdırın
         */


        if(str1.equals(str2)){
            System.out.println("metinler ayni");
        }else{
            System.out.println("metinler farklı");
        }


        System.out.println(str1.equals(str2) ? "metinler ayni" : "metinler farklı");





    }
}
