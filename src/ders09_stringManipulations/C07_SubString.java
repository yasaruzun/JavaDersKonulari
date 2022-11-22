package ders09_stringManipulations;

public class C07_SubString {
    public static void main(String[] args) {


        String str="java gün geçtikce güzelleşiyor";

        System.out.println(str.substring(5,8));//gün yazdırır. 2 farklı substring method var . 2.sini kullandık burada
        //5.indexten başlar (8-5) karakter yazdırır
        //5.index dahil(inclusive), 8.index hariç(exclusive)


        System.out.println(str.substring(9,17));//geçtikce

        System.out.println(str.substring(3,7));//a gü



        String isim= "HASAN";
        //verilen ismi ilk harfi büyük geriye kalanlar küçük harf olarak kaydedin

        isim=isim.substring(0,1).toUpperCase()+//H
        isim.substring(1).toLowerCase();//1.index ve sonrasını alıp küçük harf yaptık

        System.out.println(isim);//Hasan


        //sadece 3. indexkteki harfi yazdırın
        System.out.println(isim.substring(2,3));


        System.out.println("zor sorunun cevabı:" +isim.substring(2,2)); // hiçlik

        //System.out.println(isim.substring(5,2)); //hata verdi










    }
}
