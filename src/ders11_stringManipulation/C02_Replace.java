package ders11_stringManipulation;

public class C02_Replace {
    public static void main(String[] args) {

        String str= "java candır";

        System.out.println(str.replace('a', 'A'));//jAvA cAndır

        System.out.println(str.replace(' ','_'));//java_candır

        System.out.println(str.replace("candır","çok güzeldir"));//java çok güzeldir

        System.out.println(str.replace(" ",""));//javacandır

        //String'deki tüm a'ları silin

        System.out.println(str.replace("a", ""));//jv cndır

        //java yerine hava, candır yerine çok güzel yazdırın

        System.out.println(str.replace("java","hava")
                              .replace("candır","çok güzel"));//hava çok güzel


        System.out.println(str.replace("","_"));//_j_a_v_a_ _c_a_n_d_ı_r_


        //sadece 1.a'yı A yapalım

        System.out.println(str.replaceFirst("a","A"));//jAva candır




    }
}
