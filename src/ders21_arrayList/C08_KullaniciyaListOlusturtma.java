package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_KullaniciyaListOlusturtma {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.


        System.out.println(listeOlustur());


    }

    public static List<String>  listeOlustur(){

        List<String> isimler= new ArrayList<>();

        Scanner scan=new Scanner(System.in);

        String girilenIsim="";

        while(!girilenIsim.equalsIgnoreCase("q")){
            System.out.println("lütfen listeye eklemek icin isim giriniz"+
                                "\nbitirmek icin q'ya basiniz");

            girilenIsim=scan.nextLine();

            if(!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }
        }

        return isimler;
    }
}
