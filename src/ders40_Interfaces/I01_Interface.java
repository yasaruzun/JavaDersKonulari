package ders40_Interfaces;

public interface I01_Interface {

    /*
       Interface'ler ozel yapi oldugundan
       yazilsa da yazilmasa da tum variable'lar
       public,static ve final'dir.
     */


    String ISIM="Mustafa";
    static int SAYI=20;

    public static boolean GUZEL_MI=true;

    public static final int SAYI2=30;


    /*
        ayni sekilde
        tum method'lar public ve abstract'dir.
     */
    void method1();
    abstract int method2();// Modifier 'abstract' is redundant for interface methods
    public abstract String method3();

}
