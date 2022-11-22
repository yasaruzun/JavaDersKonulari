package ders23_Constructors;

public class DArabaRunner {

    public static void main(String[] args) {


            //DAraba class'indan bir obje olusturalim


        DAraba arb1= new DAraba();

        System.out.println(arb1.marka);//Marka belirtilmedi
        System.out.println(arb1.model);//Model belirtilmedi
        System.out.println(arb1.yakit);//null
        System.out.println(arb1.yil);//0
        System.out.println(arb1.fiyat);//0


        arb1.marka="tofas";
        arb1.model="kartal";
        arb1.yakit="benzin";
        arb1.yil=1991;
        arb1.fiyat=50000;

        System.out.println(arb1.marka);//
        System.out.println(arb1.model);//
        System.out.println(arb1.yakit);//
        System.out.println(arb1.yil);//
        System.out.println(arb1.fiyat);//
        System.out.println(arb1.maxHiz(arb1.yakit));


        DAraba arb2=new DAraba();//otomatik diger clasdaki variable olusrutuyor. sadece atıyoruz.
        //bu sekilde istedigimiz kadar uretebiliriz. tekrar variable olusturmamıza gerek yok

        //arb2'nin ozelliklerini yadirmak istesek;

        System.out.println("Marka :"+arb2.marka+
                            "\nModel :"+arb2.model+
                            "\nYakit :"+arb2.yakit+
                            "\nYil : "+arb2.yil+
                            "\nFiyat :"+arb2.fiyat);


        DAraba arb3= new DAraba();

        System.out.println(arb3);
        System.out.println(arb1);

        DAraba arb4=new DAraba();

        System.out.println(arb4);

    }

}
