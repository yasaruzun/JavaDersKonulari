package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {


        // 10,11,12 sayılarını toplayan bir whileloop oluşturalım

        int sayi=10;
        int toplam=10;


        while(sayi<=12){
            toplam+=sayi;
            sayi++;


//    while loop da önce kontrol , sonra işlem yapılır
        }
/*
while loop'da 2 problem oluşabilir;
1-önce değeri kontrol edip, sonra işle  yaptığımızdan body'de bir kere daha kontrol etmemiz gerekebilir
2-yapılan işlem sayısından 1 fazla while bitiş şartı kontrol edilir
3-while loop öncesinde değereri kontrol edeceğimiz bir variable olştıuruyorsak ona yapacağımız atamayı dikkatli yapmamız gerekir, yanlış değer ataması yapmak,
 while loop'un çalışmamasına neden olabilir
 */
        System.out.println(toplam);


    }
}
