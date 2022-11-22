package ders15_methodOverLoading_WhileLoop;

public class C13_Soru {
    public static void main(String[] args) {
//Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
//donduren bir method olusturun.

        String cumle = "Yasar ve Yasir";

        System.out.println(tersCevirmeMethodu(cumle));


    }

    public static String tersCevirmeMethodu(String cumle){
        boolean cumleVarMi = true;
        String tersCumle="";

        while (cumleVarMi) {

            for (int i = cumle.length()-1; i>=0 ; i--) {
                tersCumle+=cumle.substring(i,i+1);

            }
            break;

        }

        return tersCumle;









    }

}
