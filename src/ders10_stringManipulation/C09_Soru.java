package ders10_stringManipulation;

public class C09_Soru {
    public static void main(String[] args) {

          /*
        kullanıcıdan bir cümle ve bir metin alın
        cümdelede metnin durumuna
        1-cümle metni içermiyor
        2-cümle metni sadece 1 kere içeriyor
        3-cümle metni birden fazla içeriyor
        seçeneklerinden uygun olanı yazdırın

         */

        String cumle="java çok güzeldir.çok";
        String metin="çok";

       int ilkIndex= cumle.indexOf(metin);
       int sonIndex=cumle.lastIndexOf(metin);

       if(ilkIndex==(-1)){
           System.out.println("cümle metni içermiyor");
       }else if(ilkIndex==sonIndex){
           System.out.println("cümle metni sadece 1 kere içeriyor");
       }else{
           System.out.println("cümle metni birden fazla içeriyor");
       }



    }
}
