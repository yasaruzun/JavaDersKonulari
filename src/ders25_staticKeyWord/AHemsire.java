package ders25_staticKeyWord;

public class AHemsire {

    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdresi="Cankaya/Ankara";
    static String basHekimIsmi="Dr.Mehmet Yilmaz";

    String personelIsim="Isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
    String personelTelefon="Telefon belirtilmedi";


    public String toString() {
        return "AHemsire{" +
                "personelIsim='" + personelIsim + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", hastaneIsmi='" + hastaneIsmi + '\'' +
                ", hastaneADresi='" + hastaneAdresi + '\'' +
                ", basHekimAdi='" + basHekimIsmi + '\'' +
                '}';


    }
}
