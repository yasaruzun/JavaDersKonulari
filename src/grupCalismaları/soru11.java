package grupCalismaları;

public class soru11 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        //harf olarak yazdirin, yoksa girilen harfi yazdiri

        char harf='h';

        System.out.println(harf>'a'&& harf<'z' ? Character.toUpperCase(harf) : harf);




    }
}
