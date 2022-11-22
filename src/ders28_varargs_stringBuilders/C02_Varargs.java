package ders28_varargs_stringBuilders;

public class C02_Varargs {
    public static void main(String[] args) {

        toplam(5,6);
        toplam(5,3,8);
        toplam(2,4,6,8);

      //bir method da parametre sayisini sinirlandirmak istemezsek standart bir variable yerine varargs kullaniriz
        //varargs data türünün yanina 3 nokta konularak deklare edilir.
        //int...==> sayisi belirli olmayan int parametreler alan bir array'dir

    }

    private static void toplam(int... sayilar) {

        int toplamSonucu=0;

        for (int each:sayilar
             ) {
            toplamSonucu+=each;
        }
        System.out.println("girilen sayilarin toplami :" +toplamSonucu);
    }





}
