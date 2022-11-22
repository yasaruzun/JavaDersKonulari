package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {


        //1. for (int i = 0; i <-10 ; i++) {
            //System.out.println(i+" ");// buna sonsuzLoop denir. bunun çözümü yoktur.

        //2. ilk değer için bitiş şartı true olmuyorsa
        //for body'si hiç devreye giremez.  kod çalışır ama for body devreye girmez
        for (int i = 0; i >10 ; i++) {

        }

        //3. bir loop'u sonunu beklemeden bitirmek istersek

        //kullanıcının verdiği bir sayının asal sayı olup olmadığını bulun

        int sayi=100;
        boolean asalMi=false;



        for (int i = 2; i <=sayi-1 ; i++) {

            if(sayi % i==0){
                //askmız bitti.
                asalMi=true;
                break;

            }

        }

        System.out.println(asalMi);

        if(asalMi==false){

            System.out.println("sayi asaldır");
        }else{
            System.out.println("sayı asal değildir");
        }










    }
}
