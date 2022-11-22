package ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");

        FileOutputStream fos=new FileOutputStream("src/ders36_checkedExceptions/Deneme.txt");


        //java ile bilgisayarimizdaki bir dosyaya ulasmak istersek
        //fileInputStream class'indan obje olusturup ,
        //o obje araciligi ile dosyayi kullanabilriz

        //fis olustururken ulasmak istedigimiz dosya'nin
        //dosya yolunu parametre olarak girmeliyiz
        /*
        checked exception olusturma ihtimali olan kodlari yazdigimizda
        java compile time orada bir hata ihtimali oldgunu gorur ve
        kodun altini kirmizi olarak cizer

        bu durumda kirmizi cizgiyi kaldirmak icin 2 yontem vardır;
        1-exception'i try-catch blogu ile handle etmek,
        2-java'ya sorun ihtimali'nin fakinda oldgumuzu ama kodumuza guvendigimizi
          ve calismaya devam etmesini istedigimizi soylemek
          bunun icin method signuture'na method deklarasyonu ile curly braces arasina
          throws keyword ile FileNotFoundExceptions


         */

    }
}
