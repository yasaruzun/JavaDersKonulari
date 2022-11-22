package grupCalismaları;

public class Soru2 {
    public static void main(String[] args) {

//Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
//Not: İkinci isim kapsam dışındadır.
//Örnek: Tom Hanks ==> TH, Mary Star ==> MS

        String isimSoyisim= "Yasar uzun";

        String IsBasHarf;
        String SoyBasHarf;

        IsBasHarf=isimSoyisim.substring(0,1);
        SoyBasHarf=isimSoyisim.split(" ")[1].substring(0,1);

        System.out.println(IsBasHarf+SoyBasHarf);
    }
}
