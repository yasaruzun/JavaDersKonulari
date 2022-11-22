package ders12_forLoops;

public class C04_RakamlarToplamı {
    public static void main(String[] args) {

        //kullanıcının verdiği sayının rakamlar toplamını bulun


        int sayi= 232321111;

        String sayiStr=""+sayi;


        int birlerBasamagi=0;
        int rakamlarToplami=0;


        //bunu artık forLoop ile yapacağız

        for (int i = 1; i <=sayiStr.length() ; i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;


        }
        System.out.println(rakamlarToplami);














    }
}
