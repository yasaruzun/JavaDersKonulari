package grupCalismaları;

public class soru17 {
    public static void main(String[] args) {

        //Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        //icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini
        //yazdirin
        //- String aranan metni icermiyor
        //- Aranan metin String’de sadece 1 kere kullanilmis
        //- Aranan metin String’de sadece 1’den fazla kullanilmis


        String cumle="java canandır";
        String metin="an";


        if(!cumle.contains(metin)){
            System.out.println("cümle aranan metni icermiyor");

        }else {

        int ilkIndex=cumle.indexOf(metin);
        int ikinciIndex= cumle.lastIndexOf(metin);

        if(ikinciIndex==ilkIndex){

            System.out.println("Aranan metin String’de sadece 1 kere kullanilmis");
        }else{
            System.out.println("Aranan metin String’de  1’den fazla kullanilmis");
        }





    }
}
}
