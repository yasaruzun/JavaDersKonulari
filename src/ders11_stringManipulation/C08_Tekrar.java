package ders11_stringManipulation;

public class C08_Tekrar {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali


        String sifre= "nsadadassdsadasdasda1";
        int bayrak= 0;


        if(!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali ");
            bayrak++;
            System.out.println(bayrak);
        }

        if(!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9' )){
            System.out.println("son karakter rakam olmali");
            bayrak++;
            System.out.println(bayrak);
        }

        if(sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            bayrak++;
            System.out.println(bayrak);
        }

        if(sifre.length()<10){
            System.out.println("uzunlugu en az 10 karakter olmali");
            bayrak++;
            System.out.println(bayrak);
        }

        if(bayrak==0){
            System.out.println("sifre basariyla kaydedildi");
        }

    }
}
