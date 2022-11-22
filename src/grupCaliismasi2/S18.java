package grupCaliismasi2;

public class S18 {
    public static void main(String[] args) {

        ////120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        ////ardışık tam sayı arasında boşluk bırakarak yazınız

        String sayilar="";

        for (int i =120; i >=11 ; i--) {

            if (i%12==0){

                sayilar+=""+i+" ";


            }

        }
        System.out.println(sayilar);

    }
}
