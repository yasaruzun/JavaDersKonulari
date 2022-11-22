package ders04_matematikselIslemler_İncrementDecrement;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a = 10;

        //a variable'nın degerini yazdirip sonra a'nın degerini 1 arttırın


        System.out.println("a:" +a);//10
        a++;
          //a artik 11 ama kullanici konsolda görmeyecek. önce yazdirdik cunku

        int b=10;
        //b variable'nın degerini 1 arttirip sonra yazdirin

        b++;
        System.out.println("b:" +b);//11

        int c= 10;

        // c variablenın degerini yazdiirp sonra c'nin degerini bir arttirin

        System.out.println("c:"+c++); //10

        int d=10;

        // d variablenin degerini 1 arttırıp, sonra yazdirin

        System.out.println("d:"+ ++d);//11

        /*
        c++ veya ++d yi yazdirma veya atama isleminde kullanirsaniz
        c++'ya post increment denir ve o satir icin once islemi yapar sonra arttırmayi yapar
        ++d'ye ise pre increment denir , önce arttırma yapip sonra islemi yapar

        islemin oldugu satirin bir alt satirina gecildiğinde
        c'de d'de bir artmıştır
         */




    }
}
