package grupCalismaları;

public class soru16 {
    public static void main(String[] args) {

        //Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        // icerip icermedigini indexOf( ) method’u kullanarak yazdirin.


        String str = " biz bu isi yapariz";

        String arananMet = "aa";

        if (!str.contains(arananMet)) {
            System.out.println("içermemektedir.");
        } else {

            int ilkIndex = str.indexOf(arananMet);//

            int ikinciIndex = str.indexOf(arananMet, ilkIndex + 1);//ya -1 olacak yada bir index olacak.

            if (ikinciIndex == (-1)) {
                System.out.println("cümle metni sadece 1 kere içeriyor");
            } else {
                System.out.println("cümle metni birden fazla içeriyor");
            }


        }
    }
}
