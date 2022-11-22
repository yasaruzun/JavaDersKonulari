package selfStudy;

public class S5 {

        /*
        Girilen bir String'i tersten yazdiran bir pr create ediniz

         */

    public static void main(String[] args) {

        String str="java candir.";

        stringTersYazdirma(str);

    }
    public static void stringTersYazdirma(String str){

        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {

            tersStr+=str.substring(i,i+1);

        }

        System.out.println(tersStr);

    }
}
