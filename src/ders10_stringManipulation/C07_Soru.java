package ders10_stringManipulation;

public class C07_Soru {
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

        if(!cumle.contains(metin)){
            System.out.println("cümle metin içermiyor");

        }else{
            int ilkIndex=cumle.indexOf(metin);//5

            int ikinciIndex=cumle.indexOf(metin,ilkIndex+1);//ya -1 olacak yada bir index olacak.

            if(ikinciIndex==(-1)){
                System.out.println("cümle metni sadece 1 kere içeriyor");
            }else{
                System.out.println("cümle metni birden fazla içeriyor");
            }


        }





    }
}
