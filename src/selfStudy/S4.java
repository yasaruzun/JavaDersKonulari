package selfStudy;

public class S4 {

     /*
        Soru 2- Verilen int array'deki her elementin karelerini alip, karelerinin toplamini
yazdiran bir method olusturun.
         */

    public static void main(String[] args) {

        int []arr={2,4,10};

        arrayHerElemanKaresiniToplama(arr);
    }
    public static void arrayHerElemanKaresiniToplama(int[] arr){

        int toplam=0;


        for (int i = 0; i <arr.length ; i++) {

            toplam+=arr[i]*arr[i];


            
        }

        System.out.println(toplam);
        
    }
}
