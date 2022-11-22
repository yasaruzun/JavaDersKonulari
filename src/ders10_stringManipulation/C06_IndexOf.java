package ders10_stringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {




        String str="Ahmet hoca ile herşey clear";

        System.out.println(str.indexOf("a")); // 9 - ilk a'nın bulunduğu index'ini döndürür.

        System.out.println(str.indexOf('c'));//8

        System.out.println(str.indexOf("herşey"));// blok olarak düşünür ve hangi index den başlarsa onu döndürür.

        System.out.println(str.indexOf("e",9));//9'dan sonra e arıyoruz.13.
        System.out.println(str.indexOf("e",14)); //13.indexdeki e'den bir sonraki e'nin indexini bulma yöntemi

        //cümledeki 2.c'nin indexsini yazdırın

       int ilkcindex= str.indexOf("c");//8

        System.out.println(str.indexOf("c",ilkcindex+1));//22

        System.out.println(str.indexOf("ali"));//index olarak int döndürmesi lazım.yoksa -1 döner. sabittir.


    }
}
