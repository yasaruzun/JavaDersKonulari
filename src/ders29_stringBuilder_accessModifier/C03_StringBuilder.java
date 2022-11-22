package ders29_stringBuilder_accessModifier;

public class C03_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Java ne kadar güzel");

        System.out.println(sb.substring(4));//ne kadar güzel

        System.out.println(sb);//Java ne kadar güzel

       // sb=sb.substring(0,4); esitligi sonu SringBuilder sagi ise String
                            //  java Non-primitive datalarda casting yapmaz
        //ayni not Integer, Byte ve Short gibi sayi barindiran non primitive'ler icin de gecerlidir.

        //sb guzel kelimesi icerior mu

        /*
        StringBuilder'da olmayan String class'inda bulunan methodları kullanmak isterseniz once toString methodu ile String'e cevirip,
        sonra String manipylation  yapılabilir.


         */


        System.out.println(sb.toString().contains("guzel"));

        sb.setCharAt(5,'N');
        System.out.println(sb);//Java Ne kadar güzel



    }
}
