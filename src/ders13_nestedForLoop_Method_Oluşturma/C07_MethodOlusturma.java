package ders13_nestedForLoop_Method_Oluşturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {

        String str= "java muhteşemdir";

        //metni büyük harfe çevirin

        str.toUpperCase();
        String buyukStr=str.toUpperCase();


        System.out.println(str);//java güzeldir. büyük halini kullanmasını istiyorsak yeni değişkene atayabilriz veya eski değişkene de kaydebilriz.

        System.out.println(buyukStr);//JAVA MUHTEŞEMDİR

        //metnin büük harflere çevrilmiş hali S içerir mi?

        System.out.println(buyukStr.contains("Ş"));//true









    }
}
