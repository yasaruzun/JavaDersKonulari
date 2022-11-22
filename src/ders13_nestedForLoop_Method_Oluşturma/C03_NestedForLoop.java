package ders13_nestedForLoop_Method_Oluşturma;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        //1-4 arasındaki sayılarrr için çarpım tablosu oluşturalım

        //dış döngü satılar kontrol eder

        for (int i = 1; i <=5 ; i++) {

            //iç döngü her satırda olan değerleri kontrol eder

            for (int j = 1; j <=5 ; j++) {

                System.out.print(i*j+ " ");

            }
            //iç döngü bittiğinde javayı alt satıra indirmeliiz
            System.out.println("");

        }












    }
}
