package ders18_arrays;

public class C05_ArraysdeElemanArama {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr={1,2,4,5,6,8,4,9,3,4,2,3,6,7};


        int arananEleman=2;

        elemanAra(arr,arananEleman);
    }
    public static void elemanAra(int[] arr, int arananElaman){

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {

           if(arr[i]==arananElaman){
               sayac++;

           }

        }

        if(sayac==0){
            System.out.println("aranan sayi array'de yok");
        }else{
            System.out.println("aranan " + arananElaman +" sayisi,array'de "+ sayac+ " kere kullanilmistir");
        }
    }
}
