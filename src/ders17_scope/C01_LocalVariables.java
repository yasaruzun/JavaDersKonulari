package ders17_scope;

public class C01_LocalVariables {
    public static void main(String[] args) {

        int sayi=10;
        String isim="Ramazan";
        //System.out.println(dogruMu);

        for (int i = 0; i <0 ; i++) {
            String adres="Ankara";

            //bir loop içerisnde oluşturulan variable'lar sadece o loop içerisinde geçerlidir.
        }
        //local variable lar sadece ilgili methodun içerisinde çalşır. farklı method içerisinde çalışmaz. yoruma alınanları incele.

        double pi;
      //  System.out.println(pi); local variable'lar değer atamadan oluşturulabilir ancal kullanamazsın der.
        //kullanmadan önce değer atanmış olması lazım.

    }
    public static void method1(){

        //System.out.println(sayi);
        //isim="tugay"; atama yapılamıyor

        boolean dogruMu=true;



    }
}
