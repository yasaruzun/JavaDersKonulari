package ders23_Constructors;

public class DAraba {

    //bir proje olusturulurken tum class'larda main method olmasına gerek yoktur
    //cogu class obje olusurularak kullanilmak uzere hazirlanmis depolardir
    //Biz de bu class'i araba objeleri icin bir depo olarak dizayn edelim.

    //her class olusturuşdugunda java o class'dan obje olusturulabilmesi icin
    //default bir constructor olusturur
    //bu default constructor gorunmez
    //default constructor parametresizdir ve bize standart bir obje olusturur


    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;


    public int maxHiz(String yakit){

       int maxHiz=120;

        if(yakit.equalsIgnoreCase("dizel")){

            maxHiz=200;
        }else if(yakit.equalsIgnoreCase("benzin")){
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }

        return maxHiz;

    }



    public String toString() {
        return "Araba Ozellikleri" +
                "\nmarka :" + marka  +
                "\nmodel:" + model +
                "\nyakit=" + yakit +
                "\nyil:" + yil +
                "\nfiyat:" + fiyat;

    }
}
