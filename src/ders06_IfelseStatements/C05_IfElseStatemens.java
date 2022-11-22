package ders06_IfelseStatements;

import java.util.Scanner;

public class C05_IfElseStatemens {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");

        int yas=scan.nextInt();

        if(yas>=65){
            System.out.println("yasiniz emekli olmak icin yeterli");
        }else{
            System.out.println("emekli olmak icin:"+(65-yas)+" "+"sene daha calismalisin");}







    }
}
