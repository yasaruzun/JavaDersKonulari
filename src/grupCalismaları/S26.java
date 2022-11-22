package grupCalismaları;

public class S26 {
    public static void main(String[] args) {
        //Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin.

        String input="yasir";

        if(input.length()%2==0){

            System.out.println(input.substring(0,input.length()/2)+":)"+input.substring(input.length()/2));
        }else{
            System.out.println(input.substring(0,input.length()/2)+":("+(input.substring(input.length()/2+1)));
        }

    }
}
