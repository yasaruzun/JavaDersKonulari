package grupCalismaları;

public class soru19 {
    public static void main(String[] args) {

        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 36.70 €


        //Regex (Regular Expressions)
        //\\s : space
        // \\S : space olmayan hersey
        //\\s+ : yanyana birden fazla space
        //\\d : digits
        // \\D : digit olmayan hersey
        //\\w : harf veya rakam Veya _
        // \\W : harf veya rakam olmayan hersey

        String input1 = "15.30 €";
        String input2= "11.40 €";


        input1= input1.replace(".","9");
        input2= input2.replace(".","9");



        input1=input1.replaceAll("\\D","");
        input2=input2.replaceAll("\\D","");

        input1=input1.replace("9",".");
        input2=input2.replace("9",".");



        System.out.println(Double.parseDouble(input1)+Double.parseDouble(input2));




    }
}
