package ders17_scope;

public class C02_ClassLevelVariables {

    //class level variable'lar methodların dışında oluturulur
    //genel kullanım en üstte oluşturulmalarıdır.

    static String hastaneIsmi="Yildiz hastanesi";
    static int hastaSayisi=23453;//hasta sayısı bütün personel için geçerli. herkes etkilenir. geneldir.
    static String basHekimIsmi="henüz atama yapılmadı";
    String personelIsmi="isim girilmesi";
    String personelTelefonu="telefon  girilmedi";
    int personelYasi;

// bu variable değer atamadan da kullanılabilir method içerisinde

    public static void main(String[] args) {

        System.out.println(hastaneIsmi);//Yildiz hastanesi
        System.out.println(basHekimIsmi);//henüz atama yapılmadı-
        // System.out.println(personelIsmi);//statik olmadıgı icin static main method'dan kullanılamaz
        /*
        Class level variable'lara değer ataması yapılmamış olursa
        Java bu variable'lara data türüne göre default olarak tanımlanan degerleri atar
        default degerler
        sayısal variable'lar icin: 0
        boolean için : false
        char icin:'' hiçlik
        objeler için(String dahil):null
         */

    }

    public static void method1 (){

        System.out.println(hastaSayisi);
        hastaSayisi++;
       // System.out.println(personelIsmi);// static bir scopa dayız. bu scopun içinde statik olmayan variablelar kullanılamaz

    }
    public void method2(){

        System.out.println(hastaneIsmi);
    //static variablllar her yere gider ama static methodlar static olmayanları almaz
        hastaSayisi++;
        System.out.println(personelIsmi);//isim girilmdi
        System.out.println(personelYasi);//0
    }
}
