package ders14_methodOlusturma;

public class C05_SubstringOlustur {

    //Soru 1- Kullanicidan input olarak verilen bir String,
    // baslangic ve bitis indexlerine gore baslangic index’i dahil,bitis index’i haric olacak sekilde
    // aradaki harfleri yazdiran bir method olusturun.

    // - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    // - kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.

    public static void main(String[] args) {

        String input= "java ne kadar güzel";
        int baslangıcIndexi=5;
        int bitisIndexi=7;

        kendiSubstringmethodumuz(input,baslangıcIndexi,bitisIndexi);
        kendiSubstringmethodumuz("java",1,3);
        kendiSubstringmethodumuz("deneme",6,3);//başlangıç indexi bitiş indexinden büyük olmaz
        kendiSubstringmethodumuz("java",6,8);//bitiş indexi Stringin sınırları dışında


    }

    public static void kendiSubstringmethodumuz(String input, int baslangıcIndexi, int bitisIndexi){

        if(baslangıcIndexi>bitisIndexi){
            System.out.println("başlangıç indexi bitiş indexinden büyük olmaz");
        }else if(bitisIndexi>=input.length()){
            System.out.println("bitiş indexi Stringin sınırları dışında");
        }else{
            // baslangic ve bitis indexlerine gore baslangic index’i dahil,bitis index’i haric olacak sekilde
            // aradaki harfleri yazdiran bir method olusturun.

            for (int i = baslangıcIndexi; i <bitisIndexi ; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println(" ");
        }


    }
}
