package ders02_dataTurleri_scanner;

public class C01_Variables {

    public static void main(String[] args) {

        int okulNo= 885;

        System.out.println("okulNo :"+okulNo); // okulNo: 885 yazacak.

        okulNo=976; // daha önce olanır siler yenisini yazar . bundan sonra hep 976 bilgisi gelecek

        System.out.println("yeniokulNo :"+okulNo);

        int not2=60; // int 1 kere yazılır. değer ataması biren fazla yapılabilir. double da bunun gibidir.
        not2=not2+10; // saol taraf variable dır sağ taraf değer dir. burada 60+10=70 olur ve onu not2 ye  olarak düşünür.

        double bankadakiParam=1000;
        bankadakiParam=bankadakiParam+100;
        bankadakiParam=bankadakiParam-200;

        System.out.println(bankadakiParam);//en son kalan 900 tl yi yazıdırır.




    }
}
