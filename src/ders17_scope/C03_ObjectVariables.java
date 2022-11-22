package ders17_scope;

public class C03_ObjectVariables {
    static String hastaneIsmi="Yildiz hastanesi";
    static int hastaSayisi=23453;//hasta sayısı bütün personel için geçerli. herkes etkilenir. geneldir.
    static String basHekimIsmi="henüz atama yapılmadı";
    String personelIsmi="isim girilmesi";
    String personelTelefonu="telefon  girilmedi";
    int personelYasi;

    /*
    Class level variable'ların scope'u tüm class'tır.
    static kelimesi ile işaretlenen variable'lara class içerisinde her yerden ulaşılabildiği icin diger ismi class variables'dir.

    static kelimesi ile isaretlenmeyen variable'lara ise instance variable denir.
    instance variable'lar objelere bagli olduklarindan bu variable'ların diger adi object variables'dir.

     */

    public static void main(String[] args) {




    }
}
