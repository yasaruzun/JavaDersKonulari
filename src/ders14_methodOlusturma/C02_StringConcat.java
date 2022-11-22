package ders14_methodOlusturma;

public class C02_StringConcat {

    //verilen 2 string'i parametre olarak kabul edip
    //bu iki string'i aralarında bir bosluk olan tek bir string olarak main method'a döndüren bir method olusturun

    public static void main(String[] args) {

        String str1= "java güzeldir";
        String str2= " bu iş bende";


        System.out.println(birlestirMethodu(str1, str2));//1.yöntem
        System.out.println(birlestirMethodu("bu da "," oldu"));

    }


        public static String birlestirMethodu(String str1, String str2){

        return str1+" "+ str2;


        }
}
