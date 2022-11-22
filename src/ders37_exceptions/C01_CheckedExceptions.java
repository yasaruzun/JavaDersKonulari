package ders37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {
    public static void main(String[] args)  {

        String dosyaYolu="src/ders36_checkedExceptions/Deneme.txt";
        int k=0;

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);

            while((k=fis.read())!=-1){
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {

            System.out.println("Dosya yolu yanlıs veya dosya arizali");
        } catch (IOException e) {

            System.out.println("dosya okuma veya yazma ile ilgili bir sorun var");
        }

        /*
                Bir kod calisirken birden fazla exception olusma ihtimali varsa bu kod
                calisir hale getirmek icin 4 ihtimal vardir;

                1- herbir exception icin ic ice try-catch bloklari kullanmak
                2- 1 tane try blogu birden fazla catch blogu olusturmak
                3- method signature'na tum exception ihtimallerini yazmak(exception handle edilmis olmaz)
                4- eger muhtemel exceptions'larin tumunu kapsayan daha genis kapsamli bir exception varsa
                   onu kullanmak
         */
        /*
            2.ve 3. ihtimallerde olusmasi muhtemel exception'lar arasinda parent-child iliskisi olup-olmadigi kontrol edilmelidir
            aralarinda parent-child iliskisi yoksa exception'lari istedigimiz sirada yazabiliriz

            Ancak parent-child iliskisi varsa
            once child sonra parent yazilmalidir
            aksi taktirde parent daha kapsamli oldugundan tum exception'lari yakalar
            ve asagidaki child exception islevsiz kalir
            java bu durumu kabul etmez, CTE verir
         */
    }
}
