package ders33_inheritanceDataTypeKullanimi_overriding;

public class FAvciKuslar extends  EKuslar {

   public void hareket( ){
       System.out.println("avci kuslar ucarlar");
   }

   public void beslenme( ){
       System.out.println("avci kuslar et yerler");

   }
    public void pence( ) {
        System.out.println("avci kuslar pencelidir");
    }
   public void gaga( ){
       System.out.println("avci kuslar sivri gagalidir.");
   }

    public static void main(String[] args) {


       FAvciKuslar avci1= new FAvciKuslar();
       /*
       bir obje olusturulurken constructor ve data turu
       ayni ise hangi METHOD'un gecerli oldugunu bulmak icin
       o class'a gider varsa kullaniriz. yoksa sirasi ile
       parent'lara gider ilk buldugumuzu kullaniriz
        */
       avci1.beslenme();//Avci kuslar
       avci1.gaga();//Avci Kuslar
       avci1.pence();//Avci Kuslar
       avci1.hareket();//Avci Kuslar
       avci1.cogalma();//Kuslar
       avci1.kanat();//Kuslar
       avci1.omur();//Hayvanlar
       avci1.solunum();//Kuslar

        System.out.println("===============");
        EKuslar avci2= new FAvciKuslar();
        /*
        bir obje olusturulurken
        data turu ile contructor farkli ise
        hangi method'un gecerli olacagini bulmak icin

        Once data turu'nun oldugu class ve parent'larina bakarak o method'u
        bulurz. bulamazsak CTE verir.
        bulursak HEMEN CALİSTİRMAYİZ
        calistirmadan once o method override edilmiş mi diye kontrol ederiz
        override edilmisse , override eden methodu calistiririz.
         */


        avci2.beslenme();//Avci kuslar
        avci2.gaga();//Avci kuslar
        //avci2.pence();//CTE
        avci2.hareket();//Avci kuslar
        avci2.cogalma();//kuslar
        avci2.kanat();//kuslar
        avci2.omur();//hayvanlar
        avci2.solunum();//kuslar


        DHayvanlar avci3= new FAvciKuslar();
        avci3.beslenme();//Avcı Kuslar
        //avci3.gaga();//CTE
        //avci3.pence();//CTE
        avci3.hareket();//Avci kuslar
        avci3.cogalma();//kuslar
        //avci3.kanat();//CTE
        avci3.omur();//hayvanlar
        avci3.solunum();//kuslar


        EKuslar kus1=new EKuslar();

        kus1.cogalma();//Kuslar
        kus1.gaga();//Kuslar
        kus1.kanat();//Kuslar
        kus1.hareket();//Hayvanlar
        kus1.solunum();//Kuslar
        kus1.beslenme();//Hayvanlar
        kus1.omur();//Hayvanlar

        /*
        Method'larla belirlenen ozellikler en guncel
        bilgiyi bulurken

        variable ile belirlenen ozellikle ilk buldugu degeri kullanir

        bunun icin method'lara dinamik ozellik
        variable'a statik ozellik denir


         */

        DHayvanlar kus2= new EKuslar();

        kus2.cogalma();//Kuslar
        //kus2.gaga();//CTE
        //kus2.kanat();//CTE
        kus2.hareket();//Hayvanlar
        kus2.solunum();//Kuslar
        kus2.beslenme();//Avci Kuslar
        kus2.omur();//Hayvanlar

    }

}
