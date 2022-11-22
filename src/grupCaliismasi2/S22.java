package grupCaliismasi2;

public class S22 {
    public static void main(String[] args) {

        //// soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

        //Regex (Regular Expressions)
        //\\s : space
        // \\S : space olmayan hersey
        //\\s+ : yanyana birden fazla space
        //\\d : digits
        // \\D : digit olmayan hersey
        //\\w : harf veya rakam Veya _
        // \\W : harf veya rakam olmayan hersey


        String input="   Java ogrenmek123 Cok guzel@      ";


     input=input.replaceAll("\\d","");

        System.out.println(input);//   Java ogrenmek Cok guzel@

        input=input.replaceAll("\\s","5");
        System.out.println(input);//555Java5ogrenmek5Cok5guzel@555555

        input=input.replaceAll("\\W","");
        System.out.println(input);//555Java5ogrenmek5Cok5guzel555555

        input=input.replaceAll("5"," ");
        System.out.println(input);

        input=input.replaceAll(input.substring(0,3),"");
        System.out.println(input);


    }
}
