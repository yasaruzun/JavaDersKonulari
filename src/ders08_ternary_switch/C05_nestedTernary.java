package ders08_ternary_switch;

public class C05_nestedTernary {
    public static void main(String[] args) {
        //Ornek : Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin



        int sayi=100;

        if(sayi>0){
            System.out.println(sayi%2==0 ? "çift sayı" :"çift sayı değil");
        }else{


            //3 basamaklı veya 3 basamaklı degil seçeneklerinden uygun olanı yazdırın
            System.out.println(sayi<-99 && sayi>-1000 ? " uc basamaklı": "uc basamaklı değil");
        }

        String sonuc= sayi>0
                ?
                sayi%2==0 ? "çift sayı" :"çift sayı değil"
                :
               sayi<-99 && sayi>-1000 ? " uc basamaklı": "uc basamaklı değil";



    }
}
