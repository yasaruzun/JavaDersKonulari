package ders10_stringManipulation;

public class C05_Soru {
    public static void main(String[] args) {

        /* soru
        mail kontrolü yapan bir program hazırlayın
        1- mail @ işareti içermiyorsa "geçersiz email" yazdıralım
        2- @mail.com içermiyorsa "gmail adresini giriniz" yazdıralım
        3- @gmail.com ile bitmiyorsa "yazım hatası"  şeklinde sonuç yazdıralım

         */


       String email= "yasaruzun91@gmail.com";

       if (!email.contains("@")){
            System.out.println("geçersiz email");

        }else if(!email.contains("@gmail.com")){
           System.out.println("gmail adresinizi giriniz");

        }else if(!email.endsWith("@gmail.com")){
           System.out.println("yazım hatası");

       }else{
           System.out.println("email başarı ile kaydedildi");
       }








    }
}
