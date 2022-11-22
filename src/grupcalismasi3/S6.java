package grupcalismasi3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S6 {
    public static void main(String[] args) {
         /*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string.(Ignore case sensitivity).

		 İnputu kullanıcıdan alacak sekilde yapalım

		 *
		 * Input : Learning java is easy
		 *
		 * Output: maximum occurring character is : a
		 */


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz ");
        String cumle=scan.nextLine();


        List<Character> harfler= new ArrayList<>();

        for (int i = 0; i <cumle.length() ; i++) {

            harfler.add(cumle.charAt(i));

        }



        char tekrarEdenHarf=' ';
        int sayac=0;

        for (int i = 0; i <harfler.size() ; i++) {

            for (int j = i+1; j <harfler.size() ; j++) {

                if(harfler.get(i).equals(harfler.get(j))&& tekrarEdenHarf!=harfler.get(i)){

                    sayac++;
                    tekrarEdenHarf=harfler.get(i);

                }
                
            }

        }
        System.out.println(tekrarEdenHarf +" harfi cumle icinde " +sayac+" defa kullanılmıstır");

    }
}
