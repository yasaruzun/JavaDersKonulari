package ders25_staticKeyWord;

public class AHemsireRunner {
    public static void main(String[] args) {

        AHemsire h1=new AHemsire();
        h1.personelIsim="Ayse";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="31234254656";

        System.out.println(h1);

        AHemsire h2=new AHemsire();
        System.out.println(h2);
        h2.personelIsim="Hatice";
        h2.personelAdresi="Sincan";
        h2.personelTelefon="312456875421";

        h2.basHekimIsmi="yasar kemal";

        System.out.println("h1 :"+h1);
        System.out.println("h2 :"+h2);

        AHemsire h3=new AHemsire();
        System.out.println("h3 :"+h3);

        h3.hastaneIsmi="java hastanesi";

        System.out.println(h2.hastaneIsmi);//java hastanesi



    }
}
