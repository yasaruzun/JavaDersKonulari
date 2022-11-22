package ders30_encapsulation;

public class C01_Encapsulations {
    public static void main(String[] args) {

        AEncapsuleClass personel1=new AEncapsuleClass();
        //personel1.hastaneIsmi="dsfjsfjk" prive oldugu icin gorulemez

        //personel1.hastaUcreti=10000; private oldugu icin kullanamiyoruz

        //personel1.hemsireAdresi="Ankara";  private oldguundan ulasilamaz
        //personel1.hemsireIsmi="Yildiz Yildiz"; private oldgundan ulasilamaz
        System.out.println(personel1.getHastaneIsmi());
        personel1.setHastaUcreti(500);


        //getter ve setter methodlari
        // bazen de erisimi sinirlandirmak icin degil kullanicilarin islevi iyi anlamasi icin kullanilir

        System.out.println(personel1.getHemsireAdresi());
        personel1.setHemsireAdresi("Istanbul");

        System.out.println(personel1.getHemsireIsmi());

    }
}
