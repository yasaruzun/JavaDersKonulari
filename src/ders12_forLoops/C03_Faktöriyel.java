package ders12_forLoops;

public class C03_Faktöriyel {
    public static void main(String[] args) {
        //kullanıcının verdiği sayının faktöriyelini bulalım


        // 5! = 5*4*3*2*1=120

        int sayi =10;

        int faktoriyel=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoriyel=faktoriyel*i;


        }


        System.out.print(faktoriyel);



        //1'den 100'e kadar olan sayıları topyalın.sınırlar dahil

        int toplam=0;

        for (int i = 1; i <=100 ; i++) {

            toplam=toplam+i;
            System.out.println(i);

        }

        System.out.println(toplam);//toplamı forloop un içine yazdırmıyoruz. dışına yazdırıyprum




    }
}
