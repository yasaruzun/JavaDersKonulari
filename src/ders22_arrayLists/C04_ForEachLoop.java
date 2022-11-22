package ders22_arrayLists;

public class C04_ForEachLoop {
    public static void main(String[] args) {


        int [] arr={3,5,7,8,6,9,4,3,2};

        //bu array deki 5'den buyuk tum elementleri toplayalım

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>5){
                toplam+=arr[i];

            }


        }

        System.out.println("for loop ile toplam : "+toplam);


        //for each loop ile daha basit bir kurgu ile calisir
        //for each loop a 3 seyi soylememiz lazım

        //1-hangi data turunde degiskenlerle ugrasacaksiniz
        //2- loop'un icinde her bir eleman geldiginde hangi isimle islem yapacaksiniz
        //3-hangi array veya collection'dan elemanlar gelecek

        toplam=0;

        for (int each: arr //arr'ye git, herbir int 'i bana getir.
             ) {
            if (each>5){
                toplam+=each;
            }

        }

        System.out.println("for each loop ile toplam :"+ toplam);
    }
}
